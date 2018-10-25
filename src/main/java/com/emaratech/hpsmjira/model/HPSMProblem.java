package com.emaratech.hpsmjira.model;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */
public class HPSMProblem {
    private String problemNo;
    private String problemDescription;
    private String problemAssignee;
    private String problemTitle;
    private String problemUrgency;
    private String problemPriority;
    private String affectedService;
    private String problemStatus;
    private String subCategory;
    private String impact;
    private String incidentCount;
    private String projectKey;


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
}
