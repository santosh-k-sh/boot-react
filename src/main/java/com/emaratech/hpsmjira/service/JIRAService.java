package com.emaratech.hpsmjira.service;

import com.atlassian.jira.rest.client.api.IssueRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.VersionRestClient;
import com.atlassian.jira.rest.client.api.domain.*;
import com.atlassian.jira.rest.client.api.domain.input.FieldInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInput;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import com.emaratech.hpsmjira.model.ClosableProblem;
import com.emaratech.hpsmjira.model.HPSMProblem;
import com.emaratech.hpsmjira.model.JIRAIssue;
import com.emaratech.hpsmjira.model.Jira;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.*;
import java.util.concurrent.ExecutionException;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */
@Service
public class JIRAService {
    public static final String JIRA_TICKET_SEARCH_PATTERN_TEXT = "text ~";
    Logger logger = LoggerFactory.getLogger(JIRAService.class);
    public static final String DEFAULT_PROJECT = "TVIS";
    public static final Long DONE_STATUS = 10001L;

    private JiraRestClient restClient;
    private Jira jira;

    @Autowired
    UserService userService;

    @Autowired
    HPSMService hpsmService;

    public JiraRestClient login(Jira jira) {
        this.jira = jira;

        return authenticate();

    }

    private JiraRestClient authenticate() {
        restClient = new AsynchronousJiraRestClientFactory()
                .createWithBasicHttpAuthentication(URI.create(jira.getJiraURL()), jira.getJiraUserName(), jira.getJiraPassword());

        if(restClient.getProjectClient().getProject(DEFAULT_PROJECT).claim() != null) {
            return restClient;
        }
        return null;
    }


    public List<JIRAIssue> searchJiraTicket(String problemNo) {
        StringBuffer searchJqlText = new StringBuffer(JIRA_TICKET_SEARCH_PATTERN_TEXT);
        searchJqlText.append(problemNo);
        //searchJqlText.append("PM15041");
        List<JIRAIssue> jiraIssues = new ArrayList<JIRAIssue>();

        if(restClient != null) {
            logger.info("Searching in JIRA for Problem No : " + problemNo);
            Promise<SearchResult> searchJqlPromise = restClient.getSearchClient().searchJql(searchJqlText.toString());

            if(searchJqlPromise != null && ((Collection) searchJqlPromise.claim().getIssues()).size()  > 0) {
                boolean fixWasReleased = false;
                String jiraID = "";
                StringBuffer fixVersions = new StringBuffer();

                logger.info("Problem No : " + problemNo + " found in JIRA");
                for (Issue resultIssue : searchJqlPromise.claim().getIssues()) {
                    JIRAIssue jiraIssue = new JIRAIssue();
                    jiraIssue.setIssueKey(resultIssue.getKey());
                    jiraIssue.setDescription(resultIssue.getDescription());
                    jiraIssue.setSummary(resultIssue.getSummary());
                    jiraIssue.setIssueStatus(resultIssue.getStatus().getName());
                    jiraIssue.setCreatedDate(resultIssue.getCreationDate());

                    if(resultIssue.getFixVersions() != null && Objects.equals(resultIssue.getStatus().getId(), DONE_STATUS)) { // Status : Done
                        jiraID = resultIssue.getKey();

                        for(Version version : resultIssue.getFixVersions()) {
                            fixVersions.append(version.getName());

                            VersionRestClient versionRestClient = restClient.getVersionRestClient();
                            Promise<Version> versionPromise = versionRestClient.getVersion(version.getSelf());
                            if(!versionPromise.claim().isReleased()) {
                                fixWasReleased = false;
                                break;
                            }
                            fixWasReleased = true;
                        }
                        jiraIssue.setFixVersion(fixVersions.toString());
                    }

                    jiraIssues.add(jiraIssue);
                }

                if(fixWasReleased) {
                    if(((Collection) searchJqlPromise.claim().getIssues()).size() > 1) {
                        for (Issue resultIssue : searchJqlPromise.claim().getIssues()) {
                            if(!Objects.equals(resultIssue.getStatus().getId(), DONE_STATUS)) {
                                fixWasReleased = false;
                                break;
                            }
                        }
                    }

                    if(fixWasReleased) {
                        ClosableProblem closableProblem = new ClosableProblem();
                        closableProblem.setAssignee("ConnectAll");
                        closableProblem.setClosureCode("Successful");
                        closableProblem.setAssigneeGroup("ConnectAll Group");
                        closableProblem.setHpsmProblemId(problemNo);
                        String solutionText = "Fixed provided and deployed under fix-version - " + fixVersions.toString() + " - " + jiraID;
                        closableProblem.setSolution(solutionText);
                        closableProblem.setSubCategory("application error");

                        hpsmService.getClosableProblems().add(closableProblem);
                    }
                }
            } else {
                logger.info("============================================================================");
                logger.info("Problem No : " + problemNo + " NOT found in JIRA");
                logger.info("============================================================================");
            }
        }
        return jiraIssues;
    }

    public List<String> createJIRATicket() {
        logger.info("createJIRATicket start...");
        IssueRestClient issueClient = restClient.getIssueClient();
        IssueType problemIssueType = null;
        List<String> newlyCreatedJIRAIds = new ArrayList<String>();

        for(Map.Entry<String, List<HPSMProblem>> hpsmProblemDetail : userService.getProblemToMigrate().entrySet()) {
            try {
                Project jiraProjectByProjectKeyId = restClient.getProjectClient().getProject(hpsmProblemDetail.getKey()).get();
                Iterator issueTypeIterator = jiraProjectByProjectKeyId.getIssueTypes().iterator();

                for (Iterator it = issueTypeIterator; it.hasNext(); ) {
                    IssueType issueType = (IssueType) it.next();
                    if (issueType.getName().equals("Problem")) {
                        problemIssueType = issueType;
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            if(problemIssueType != null) {
                List<HPSMProblem> problemList = hpsmProblemDetail.getValue();
                List<HPSMProblem> newlyCreatedProblemList = new ArrayList<HPSMProblem>();

                if(problemList.size() > 0) {
                    for (HPSMProblem hpsmProblem : problemList) {
                        /* Custom fields settings
                        * - customfield_10106: HPSM ID */
                        FieldInput hpsmFieldInput = new FieldInput("customfield_10106", hpsmProblem.getProblemNo());
                        FieldInput environmentFieldInput = new FieldInput("customfield_13657", "Production");


                        logger.info("Trying to create JIRA against Problem - " + hpsmProblem.getProblemNo());

                        IssueInput newIssue = new IssueInputBuilder(hpsmProblemDetail.getKey(),
                                problemIssueType.getId(), hpsmProblem.getProblemTitle())
                                .setDescription(hpsmProblem.getProblemDescription())
                                .setPriorityId(Long.valueOf(hpsmProblem.getProblemPriority()))
                                .setIssueType(problemIssueType)
                                //.setIssueTypeId(hpsmProblemDet.getProjectKey().equals("problem")? 10900L:1090L) // TODO: CR to be handled here
                                //.setReporterName("Rana Khurram Shahzad")
                                .setFieldInput(hpsmFieldInput)
                                //.setFieldInput(environmentFieldInput)

                                .build();

                        logger.info("...");
                        String jiraID = issueClient.createIssue(newIssue).claim().getKey();
                        logger.info("JIRA created succefully." + jiraID + " for problem " + hpsmProblem.getProblemNo());

                        newlyCreatedJIRAIds.add(jiraID);

                        newlyCreatedProblemList.add(hpsmProblem);
                    }
                    problemList.removeAll(newlyCreatedProblemList);
                    hpsmService.getNonAvailableHPSMProblemInJIRA().addAll(newlyCreatedProblemList);
                }
            }
        }

        logger.info("newlyCreatedJIRAIds : " + newlyCreatedJIRAIds);
        return newlyCreatedJIRAIds;
    }

    public JiraRestClient getRestClient() {
        return restClient;
    }

    public void setRestClient(JiraRestClient restClient) {
        this.restClient = restClient;
    }

    public void setJira(Jira jira) {
        this.jira = jira;
    }
}
