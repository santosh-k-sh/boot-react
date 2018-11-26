package com.emaratech.hpsmjira.model;

import javax.persistence.*;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */

@Entity
@Table(name = "HPSM_PROBLEM")
public class HPSMProblem {
    @Id
    @Column(name = "PROBLEM_ID")
    private Long problemId;
    @Column(name = "PROBLEM_NO")
    private String problemNo;
    @Column(name = "PROBLEM_DESC", length = 5000)
    private String problemDescription;
    @Column(name = "PROBLEM_ASSIGNEE")
    private String problemAssignee;
    @Column(name = "PROBLEM_TITLE")
    private String problemTitle;
    @Column(name = "PROBLEM_URGENCY")
    private String problemUrgency;
    @Column(name = "PROBLEM_PRIORITY")
    private String problemPriority;
    @Column(name = "AFFECTED_SERVICE")
    private String affectedService;
    @Column(name = "PROBLEM_STATUS")
    private String problemStatus;
    @Column(name = "SUB_CATEGORY")
    private String subCategory;
    @Column(name = "PROBLEM_IMPACT")
    private String impact;
    @Column(name = "PROBLEM_INCIDENT_COUNT")
    private String incidentCount;
    @Column(name = "PROBLEM_KEY")
    private String projectKey;
    @Column(name = "JIRA_ID")
    private String correspondingJIRAId;


    public String getProblemNo() {
        return problemNo;
    }

    public void setProblemNo(String problemNo) {
        this.problemNo = problemNo;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getProblemAssignee() {
        return problemAssignee;
    }

    public void setProblemAssignee(String problemAssignee) {
        this.problemAssignee = problemAssignee;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public String getProblemUrgency() {
        return problemUrgency;
    }

    public void setProblemUrgency(String problemUrgency) {
        this.problemUrgency = problemUrgency;
    }

    public String getProblemPriority() {
        return problemPriority;
    }

    public void setProblemPriority(String problemPriority) {
        this.problemPriority = problemPriority;
    }

    public String getAffectedService() {
        return affectedService;
    }

    public void setAffectedService(String affectedService) {
        this.affectedService = affectedService;
    }

    public String getProblemStatus() {
        return problemStatus;
    }

    public void setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getIncidentCount() {
        return incidentCount;
    }

    public void setIncidentCount(String incidentCount) {
        this.incidentCount = incidentCount;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getCorrespondingJIRAId() {
        return correspondingJIRAId;
    }

    public void setCorrespondingJIRAId(String correspondingJIRAId) {
        this.correspondingJIRAId = correspondingJIRAId;
    }

    @Override
    public String toString() {
        return "HPSMProblem{" +
                "problemNo='" + problemNo + '\'' +
                ", problemTitle='" + problemTitle + '\'' +
                ", problemStatus='" + problemStatus + '\'' +
                ", projectKey='" + projectKey + '\'' +
                ", correspondingJIRAId='" + correspondingJIRAId + '\'' +
                '}';
    }
}
