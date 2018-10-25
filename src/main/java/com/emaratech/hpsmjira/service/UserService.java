package com.emaratech.hpsmjira.service;

import com.emaratech.hpsmjira.model.HPSMProblem;
import com.emaratech.hpsmjira.model.Project;
import com.emaratech.hpsmjira.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Santosh.Sharma on 9/29/2018.
 */
@Service
public class UserService {
    private User user;
    private Map<String, List<HPSMProblem>> problemToMigrate;
    private List<Project> selectedProjects;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, List<HPSMProblem>> getProblemToMigrate() {
        return problemToMigrate;
    }

    public void setProblemToMigrate(Map<String, List<HPSMProblem>> problemToMigrate) {
        this.problemToMigrate = problemToMigrate;
    }

    public List<Project> getSelectedProjects() {
        return selectedProjects;
    }

    public void setSelectedProjects(List<Project> selectedProjects) {
        this.selectedProjects = selectedProjects;
    }
}
