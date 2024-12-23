package com.example.RegionalManager.dto;

public class Userdto {

    private Integer userId;

    private String userName;

    private String userMail;

    private String userAddress;

    private String userPreference;

    private Integer franchiseId;

    public Userdto() {
    }

    public Userdto(Integer franchiseId, String userAddress, Integer userId, String userMail, String userName, String userPreference) {
        this.franchiseId = franchiseId;
        this.userAddress = userAddress;
        this.userId = userId;
        this.userMail = userMail;
        this.userName = userName;
        this.userPreference = userPreference;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
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
