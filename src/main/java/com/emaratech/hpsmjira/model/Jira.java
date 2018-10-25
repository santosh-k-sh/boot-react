package com.emaratech.hpsmjira.model;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */
public class Jira {
    private String jiraURL;
    private String jiraUserName;
    private String jiraPassword;
    private boolean authenticated = false;

    public String getJiraURL() {
        return jiraURL;
    }

    public void setJiraURL(String jiraURL) {
        this.jiraURL = jiraURL;
    }

    public String getJiraUserName() {
        return jiraUserName;
    }

    public void setJiraUserName(String jiraUserName) {
        this.jiraUserName = jiraUserName;
    }

    public String getJiraPassword() {
        return jiraPassword;
    }

    public void setJiraPassword(String jiraPassword) {
        this.jiraPassword = jiraPassword;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}
