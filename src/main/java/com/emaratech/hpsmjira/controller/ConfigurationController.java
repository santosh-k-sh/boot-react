package com.emaratech.hpsmjira.controller;

import com.emaratech.hp.schemas.sm._7.RetrieveNEW9330035ProblemKeysListResponse;
import com.emaratech.hpsmjira.model.*;
import com.emaratech.hpsmjira.model.Project;
import com.emaratech.hpsmjira.service.HPSMService;
import com.emaratech.hpsmjira.service.JIRAService;
import com.emaratech.hpsmjira.service.UserService;
import com.emaratech.hpsmjira.utility.LookupProvider;
import com.emaratech.hpsmjira.model.HPSMCredential;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import sun.net.www.protocol.http.AuthCacheImpl;
import sun.net.www.protocol.http.AuthCacheValue;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */

@RestController
public class ConfigurationController {

    Logger logger = LoggerFactory.getLogger(ConfigurationController.class);


    @Autowired
    JIRAService jiraService;

    @Autowired
    HPSMService hpsmService;

    @Autowired
    LookupProvider lookupProvider;

    @Autowired
    UserService userService;

    static ScheduledExecutorService executor;
    static Runnable runnable;
    static ScheduledFuture<?> future;

    @GetMapping("/allProjects")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Project> allProjects() {
        List<Project> projectList = new ArrayList<>();
        Project project = new Project();
        project.setProjectId("001");
        project.setProjectName("Test");
        projectList.add(project);

        return projectList;
    }

    @PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
    public List<Project> addMember(@RequestBody String hpsmUserName) throws JSONException {
        //code
        JSONObject responseJson = new JSONObject();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/json; charset=utf-8");

        List<Project> projectList = new ArrayList<>();
        Project project = new Project();
        project.setProjectId("001");
        project.setProjectName("Test");

        responseJson.put("projectList", projectList);

        return projectList;
    }



    /*
    * REACT JS Changes
    *
    * */

    @RequestMapping(value = "/validatehpsm", method = RequestMethod.POST)
    public boolean validateHPSMCredential(@RequestBody HPSMCredential hpsmCredential) throws JSONException {
        JSONObject responseJson = new JSONObject();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/json; charset=utf-8");

        User user = new User();
        Hpsm  hpsmUser = new Hpsm();
        hpsmUser.setHpsmURL(hpsmCredential.getHpsmUrl());
        hpsmUser.setHpsmUserName(hpsmCredential.getHpsmUserName());
        hpsmUser.setHpsmPassword(hpsmCredential.getHpsmPassword());
        hpsmUser.setAuthenticated(false);
        user.setHpsmUser(hpsmUser);

        if(userService.getUser() != null) {
            userService.getUser().setHpsmUser(hpsmUser);
        } else if(userService.getUser() == null) {
            userService.setUser(user);
        }

        try {
            logger.debug("calling hpsm..");

            Map<String, List<RetrieveNEW9330035ProblemKeysListResponse>> retrieveProblemKeysListResponse = hpsmService.auth(user.getHpsmUser().getHpsmURL(), user.getHpsmUser().getHpsmUserName(),user.getHpsmUser().getHpsmPassword());

            user.getHpsmUser().setAuthenticated(true);
            responseJson.put("AUTHENTICATED", true);

            AuthCacheValue.setAuthCache(new AuthCacheImpl());

            if(userService.getUser().getHpsmUser() != null && userService.getUser().getHpsmUser().isAuthenticated() &&
                    userService.getUser().getJiraUser() != null && userService.getUser().getJiraUser().isAuthenticated()) {
                user.setUserAuthenticated(true);
                userService.getUser().setUserAuthenticated(true);
            }

        } catch (Exception e) {
            logger.info("HPSM Exception : " + e.getMessage());
            if(user.getHpsmUser() != null) {
                user.getHpsmUser().setAuthenticated(false);
            }
            if(userService.getUser() != null) {
                userService.getUser().setUserAuthenticated(false);
            }

            responseJson.put("AUTHENTICATED", false);
        }

        if(userService.getUser() == null) {
            userService.setUser(user);
        } else {
            userService.getUser().setHpsmUser(user.getHpsmUser());
        }

        if(userService.getUser().getHpsmUser() != null && userService.getUser().getHpsmUser().isAuthenticated() &&
                userService.getUser().getJiraUser() != null && userService.getUser().getJiraUser().isAuthenticated()) {
            userService.getUser().setUserAuthenticated(true);
        }

        logger.info("HPSM User Authenticated : "+user.getHpsmUser().isAuthenticated());
        return userService.getUser().getHpsmUser().isAuthenticated();
    }


    @RequestMapping(value = "/authenticatejira", method = RequestMethod.POST)
    public boolean authenticatejira(@RequestBody Jira jiraCredential) throws JSONException {
        JSONObject responseJson = new JSONObject();
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/json; charset=utf-8");

        if(userService.getUser() != null) {
            userService.getUser().setJiraUser(jiraCredential);
        } else if(userService.getUser() == null) {
            User user = new User();
            user.setJiraUser(jiraCredential);
            userService.setUser(user);
        }

        try {
            jiraService.login(jiraCredential);
            userService.getUser().getJiraUser().setAuthenticated(true);
            responseJson.put("AUTHENTICATED", true);
        } catch (Exception e) {
            responseJson.put("AUTHENTICATED", false);
            if(userService.getUser().getJiraUser() != null) {
                userService.getUser().getJiraUser().setAuthenticated(false);
            }

            if(userService.getUser() != null) {
                userService.getUser().setUserAuthenticated(false);
            }
        }

        if(userService.getUser().getHpsmUser() != null && userService.getUser().getHpsmUser().isAuthenticated() &&
                userService.getUser().getJiraUser() != null && userService.getUser().getJiraUser().isAuthenticated()) {
            userService.getUser().setUserAuthenticated(true);
        }

        logger.info("JIRA User Authenticated : "+userService.getUser().getJiraUser().isAuthenticated());
        return userService.getUser().getJiraUser().isAuthenticated();
    }

    /*@CrossOrigin(origins = "http://localhost:3000")*/
    @RequestMapping(value = "/hpsmProjects")
    public List<HPSMProject>  hpsmProjects() {
        return lookupProvider.loadHPSMProjects();
    }

    @RequestMapping(value = "/jiraProjects")
    public List<JIRAProject>  jiraProjects() {
        return lookupProvider.loadJIRAProjects();
    }

    @RequestMapping(value = "/addBusinessMappings")
    public List<Project> addBusinessMappings(@RequestParam String selectedHPSMProjectName, @RequestParam String selectedJIRAProjectName) {
        List<Project> selectedProjects = userService.getSelectedProjects();
        String selectedHPSMProjectId = null;
        String selectedJIRAProjectId = null;

        if(selectedProjects == null) {
            selectedProjects = new ArrayList<Project>();
        }

        if(Objects.equals(selectedHPSMProjectName, "") || Objects.equals(selectedJIRAProjectName, "")) {
            return selectedProjects;
        }

        for(HPSMProject project : lookupProvider.loadHPSMProjects()) {
            if(project.getProjectName().equals(selectedHPSMProjectName)) {
                selectedHPSMProjectId = project.getProjectId();
                break;
            }
        }

        if(selectedHPSMProjectId != null) {
            for(JIRAProject jiraProject : lookupProvider.loadJIRAProjects()) {
                if(selectedJIRAProjectName.equals(jiraProject.getProjectId())) {
                    selectedJIRAProjectId = jiraProject.getProjectId();
                    break;
                }
            }
        }

        Project project = new Project();
        project.setProjectId(selectedHPSMProjectId);
        project.setProjectName(selectedHPSMProjectName + " [" + selectedJIRAProjectId + "]");

        selectedProjects.add(project);
        userService.setSelectedProjects(selectedProjects);

        return selectedProjects;
    }

    @RequestMapping(value = "/removeBusinessMappings")
    public List<Project> removeBusinessMappings(@RequestParam String selectedProjectIndexToRemove) {
        List<Project> selectedProjects = userService.getSelectedProjects();

        if(Objects.equals(selectedProjectIndexToRemove, "")) {
            return selectedProjects;
        }

        selectedProjects.remove(Integer.parseInt(selectedProjectIndexToRemove));
        userService.setSelectedProjects(selectedProjects);

        return selectedProjects;
    }

    @RequestMapping(value = "/getSelectedProjectMappings")
    public List<Project> getSelectedProjectMappings() {
        return userService.getSelectedProjects();
    }


    @RequestMapping(value = "/loadHPSMProblems")
    public List<HPSMProblem> loadHPSMProblems(@RequestParam String selectedJobFrequency, @RequestParam String scheduledType) {
        List<HPSMProblem> hpsmProblems = new ArrayList<HPSMProblem>();
        logger.info("Job configure for frequency of " + selectedJobFrequency + scheduledType);
        logger.info("Selected HPSM Projects to migrate : " + userService.getSelectedProjects());

        if(selectedJobFrequency != null && selectedJobFrequency.length() > 0) {
            TimeUnit timeUnit = TimeUnit.HOURS;
            if(scheduledType.equalsIgnoreCase("M")) {
                timeUnit = TimeUnit.MINUTES;
            }

            initiateJob(Long.parseLong(selectedJobFrequency), timeUnit);
        }

        return hpsmProblems;
    }

    @RequestMapping(value = "/updateSchedule")
    public List<HPSMProblem> updateSchedule(@RequestParam String selectedJobFrequency, @RequestParam String scheduledType) {
        List<HPSMProblem> hpsmProblems = new ArrayList<HPSMProblem>();

        logger.info("Schedule updated as " + selectedJobFrequency + scheduledType);
        logger.info("Selected HPSM Projects to migrate : " + userService.getSelectedProjects());

        if(selectedJobFrequency != null && selectedJobFrequency.length() > 0) {
            TimeUnit timeUnit = TimeUnit.HOURS;
            if(scheduledType.equalsIgnoreCase("M")) {
                timeUnit = TimeUnit.MINUTES;
            }

            changeDelay(Long.parseLong(selectedJobFrequency), timeUnit);

            //initiateJob(Long.parseLong(selectedJobFrequency), timeUnit);
        }

        return hpsmProblems;
    }

    private void loadHPSMProblemToProcess() {
        if(hpsmService.getProblemManagement() != null) {
            Map<String, List<RetrieveNEW9330035ProblemKeysListResponse>> retrieveProblemKeysListResponseMap = hpsmService.retrieveProblemKeysList();

            if(retrieveProblemKeysListResponseMap != null) {
                for (Map.Entry<String, List<RetrieveNEW9330035ProblemKeysListResponse>> retrieveProblemKeysListResponse : retrieveProblemKeysListResponseMap.entrySet()) {
                    String projectKey = retrieveProblemKeysListResponse.getKey().split(":")[0];
                    for(RetrieveNEW9330035ProblemKeysListResponse problemResponse : retrieveProblemKeysListResponse.getValue()) {
                        populateHPSMProblem(projectKey, problemResponse);
                    }
                }
            }
        }
    }

    private void populateHPSMProblem(String projectKey, RetrieveNEW9330035ProblemKeysListResponse retrieveProblemKeysListResponse) {
        Map<String, List<HPSMProblem>> hpsmProblemMap = new HashMap<String, List<HPSMProblem>>();
        hpsmProblemMap.put(null, new ArrayList<HPSMProblem>());

        List<JIRAIssue> jiraIssues = new ArrayList<JIRAIssue>();
        jiraIssues.add(new JIRAIssue());

        if(userService != null && /*userService.getUser() != null && userService.getUser().isUserAuthenticated() &&*/
                hpsmService != null && hpsmService.getProblemManagementService() != null) {
            hpsmProblemMap.clear();
            hpsmProblemMap = hpsmService.loadHPSMProblemOfNonAvailableJIRAItem(projectKey, retrieveProblemKeysListResponse);
            logger.debug("HPSM Problems for non available JIRA Item : " + hpsmProblemMap);

            if(userService.getProblemToMigrate() != null && userService.getProblemToMigrate().entrySet().size() > 0) {
                userService.getProblemToMigrate().putAll(hpsmProblemMap);
            } else if (hpsmProblemMap.size() > 0){
                userService.setProblemToMigrate(hpsmProblemMap);
            }

            logger.info("HPSM problem to migrate into JIRA against project key ["+projectKey+"] : "+ userService.getProblemToMigrate());
        }
    }

    public void initiateJob(long scheduleHourlyDelay, TimeUnit timeUnit) {
        executor = Executors.newScheduledThreadPool(1);
        runnable = new Runnable() {
            @Override
            public void run() {
                logger.info("============================== JOB INITIATED ==============================");
                logger.info("====================== " +new Date()+ " =======================");
                if(userService.getUser().isUserAuthenticated()) {
                    loadHPSMProblemToProcess();
                }

                boolean problemNeedsToMigrate = false;
                if(userService.getProblemToMigrate() != null) {
                    for (Map.Entry<String, List<HPSMProblem>> hpsmProblemDetail : userService.getProblemToMigrate().entrySet()) {
                        if (hpsmProblemDetail.getValue().size() > 0) {
                            problemNeedsToMigrate = true;
                            break;
                        }
                    }
                }

                logger.info("Problem available to migrate : "+ problemNeedsToMigrate);

                if(problemNeedsToMigrate && userService.getProblemToMigrate() != null && userService.getProblemToMigrate().size() > 0) {
                    logger.info("============================================================================");
                    logger.info("Problems to migrate : " + userService.getProblemToMigrate().entrySet().size());
                    jiraService.createJIRATicket();
                }

                // Close Problems
                if(hpsmService.getClosableProblems() != null && hpsmService.getClosableProblems().size() > 0) {
                    hpsmService.closeProblem();
                } else if (hpsmService.getClosableProblems() != null && hpsmService.getClosableProblems().size() == 0) {
                    logger.info("Searching for closable problem list");
                    hpsmService.validateAndCloseProblem();
                }

                if(hpsmService.getNonAvailableHPSMProblemInJIRA() != null && hpsmService.getNonAvailableHPSMProblemInJIRA().size() > 0) {
                    logger.info("Saving newly migrated HPSM Problem");
                    hpsmService.saveHPSMProblem(hpsmService.getNonAvailableHPSMProblemInJIRA());
                    hpsmService.getNonAvailableHPSMProblemInJIRA().clear();
                }

                logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ JOB CYCLE COMPLETED ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                logger.info("~~~~~~~~~~~~~~~~~~~~~~~~~ " +new Date()+ " ~~~~~~~~~~~~~~~~~~~~~~~~~~");

            }
        };
        future = executor.scheduleWithFixedDelay(runnable, 0, scheduleHourlyDelay, timeUnit);

        try {
            Thread.sleep(20000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void changeDelay(long scheduleHourlyDelay, TimeUnit timeUnit) {
        boolean res = future.cancel(false);
        logger.info("Previous task canceled: " + res);

        future = executor.scheduleWithFixedDelay(runnable, 0, scheduleHourlyDelay, timeUnit);
    }

    @RequestMapping(value = "/processedProblems")
    public List<HPSMProblem>  getProcessedProblems() {
        return hpsmService.loadHPSMProblemList();
    }

}

