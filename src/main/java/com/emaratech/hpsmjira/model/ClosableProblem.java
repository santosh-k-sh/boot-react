package com.emaratech.hpsmjira.model;

/**
 * Created by santosh.sharma on 10/22/2018.
 */
public class ClosableProblem {
    private String hpsmProblemId;
    private String subCategory;
    private String assigneeGroup;
    private String assignee;
    private String closureCode;
    private String solution;

    public String getHpsmProblemId() {
        return hpsmProblemId;
    }

    public void setHpsmProblemId(String hpsmProblemId) {
        this.hpsmProblemId = hpsmProblemId;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getAssigneeGroup() {
        return assigneeGroup;
    }

    public void setAssigneeGroup(String assigneeGroup) {
        this.assigneeGroup = assigneeGroup;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getClosureCode() {
        return closureCode;
    }

    public void setClosureCode(String closureCode) {
        this.closureCode = closureCode;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "ClosableProblem{" +
                "hpsmProblemId='" + hpsmProblemId + '\'' +
                ", solution='" + solution + '\'' +
                '}';
    }
}
