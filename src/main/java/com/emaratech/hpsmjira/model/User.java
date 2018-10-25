package com.emaratech.hpsmjira.model;

import java.util.List;

/**
 * Created by Santosh.Sharma on 9/28/2018.
 */
public class User {
    private Hpsm hpsmUser;
    private Jira jiraUser;
    private boolean userAuthenticated = false;
    private BusinessServiceMapping businessServiceMapping;
    private List<Project> selectedProjects;
    private String selectedProjectToRemove;

    private Long scheduleType;
    private Long scheduledHour;

    private String selectedHPSMService;
    private String selectedJIRAType;

    public Hpsm getHpsmUser() {
        return hpsmUser;
    }

    public void setHpsmUser(Hpsm hpsmUser) {
        this.hpsmUser = hpsmUser;
    }

    public Jira getJiraUser() {
        return jiraUser;
    }

    public void setJiraUser(Jira jiraUser) {
        this.jiraUser = jiraUser;
    }

    public boolean isUserAuthenticated() {
        return userAuthenticated;
    }

    public void setUserAuthenticated(boolean userAuthenticated) {
        this.userAuthenticated = userAuthenticated;
    }

    public BusinessServiceMapping getBusinessServiceMapping() {
        return businessServiceMapping;
    }

    public void setBusinessServiceMapping(BusinessServiceMapping businessServiceMapping) {
        this.businessServiceMapping = businessServiceMapping;
    }

    public String getSelectedHPSMService() {
        return selectedHPSMService;
    }

    public void setSelectedHPSMService(String selectedHPSMService) {
        this.selectedHPSMService = selectedHPSMService;
    }

    public String getSelectedJIRAType() {
        return selectedJIRAType;
    }

    public void setSelectedJIRAType(String selectedJIRAType) {
        this.selectedJIRAType = selectedJIRAType;
    }

    public List<Project> getSelectedProjects() {
        return selectedProjects;
    }

    public void setSelectedProjects(List<Project> selectedProjects) {
        this.selectedProjects = selectedProjects;
    }

    public String getSelectedProjectToRemove() {
        return selectedProjectToRemove;
    }

    public void setSelectedProjectToRemove(String selectedProjectToRemove) {
        this.selectedProjectToRemove = selectedProjectToRemove;
    }

    public Long getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Long scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Long getScheduledHour() {
        return scheduledHour;
    }

    public void setScheduledHour(Long scheduledHour) {
        this.scheduledHour = scheduledHour;
    }
}
