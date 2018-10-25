package com.emaratech.hpsmjira.model;

/**
 * Created by Santosh.Sharma on 9/27/2018.
 */
public class Hpsm {
    private String hpsmURL;
    private String hpsmUserName;
    private String hpsmPassword;
    private boolean authenticated = false;

    public String getHpsmURL() {
        return hpsmURL;
    }

    public void setHpsmURL(String hpsmURL) {
        this.hpsmURL = hpsmURL;
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

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}
