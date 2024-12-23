package com.example.FranchiseOwner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Userdto {

    private Integer userId;

    private String userName;

    private String userAddress;

    private String userMail;

    private String userPreference;

    public Userdto() {
    }

    public Userdto(String userAddress, Integer userId, String userMail, String userName, String userPreference) {
        this.userAddress = userAddress;
        this.userId = userId;
        this.userMail = userMail;
        this.userName = userName;
        this.userPreference = userPreference;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPreference() {
        return userPreference;
    }

    public void setUserPreference(String userPreference) {
        this.userPreference = userPreference;
    }
}
