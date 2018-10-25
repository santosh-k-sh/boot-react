package com.emaratech.hpsmjira.model;

/**
 * Created by santosh.sharma on 10/8/2018.
 */
public class HPSMCredential {
    private String hpsmUrl;
    private String hpsmUserName;
    private String hpsmPassword;

    public String getHpsmUrl() {
        return hpsmUrl;
    }

    public void setHpsmUrl(String hpsmUrl) {
        this.hpsmUrl = hpsmUrl;
    }

    public String getHpsmUserName() {
        return hpsmUserName;
    }

    public void setHpsmUserName(String hpsmUserName) {
        this.hpsmUserName = hpsmUserName;
    }

    public String getHpsmPassword() {
        return hpsmPassword;
    }

    public void setHpsmPassword(String hpsmPassword) {
        this.hpsmPassword = hpsmPassword;
    }
}
