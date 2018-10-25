package com.emaratech.hpsmjira.model;

/**
 * Created by Santosh.Sharma on 9/28/2018.
 */
public class JIRAProject {
    private String projectId;
    private String projectName;

    public JIRAProject() {

    }

    public JIRAProject(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
