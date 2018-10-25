package com.emaratech.hpsmjira.model;

import java.util.List;
import java.util.Map;

/**
 * Created by Santosh.Sharma on 9/28/2018.
 */
public class BusinessServiceMapping {
    private String hpsmBusinessService;
    private String selectedJIRAProjectId;
    private String selectedHPSMProjectName;

    private JIRAProject jiraProject;
    private HPSMProject hpsmProject;

    private Map<String, Project> selectedProjectMap;

    public String getHpsmBusinessService() {
        return hpsmBusinessService;
    }

    public void setHpsmBusinessService(String hpsmBusinessService) {
        this.hpsmBusinessService = hpsmBusinessService;
    }


    public JIRAProject getJiraProject() {
        return jiraProject;
    }

    public void setJiraProject(JIRAProject jiraProject) {
        this.jiraProject = jiraProject;
    }

    public HPSMProject getHpsmProject() {
        return hpsmProject;
    }

    public void setHpsmProject(HPSMProject hpsmProject) {
        this.hpsmProject = hpsmProject;
    }

    public Map<String, Project> getSelectedProjectMap() {
        return selectedProjectMap;
    }

    public void setSelectedProjectMap(Map<String, Project> selectedProjectMap) {
        this.selectedProjectMap = selectedProjectMap;
    }

    public String getSelectedJIRAProjectId() {
        return selectedJIRAProjectId;
    }

    public void setSelectedJIRAProjectId(String selectedJIRAProjectId) {
        this.selectedJIRAProjectId = selectedJIRAProjectId;
    }

    public String getSelectedHPSMProjectName() {
        return selectedHPSMProjectName;
    }

    public void setSelectedHPSMProjectName(String selectedHPSMProjectName) {
        this.selectedHPSMProjectName = selectedHPSMProjectName;
    }

}
