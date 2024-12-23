package com.ust.EndUsers.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usertable")
public class UserEntity {

    @Id

    private Integer userId;

    private String userName;

    private String userMail;

    private String userAddress;

    private String userPreference;

    private Integer franchiseId;


    public UserEntity() {
    }

    public UserEntity(Integer userId, String userName, String userMail, String userAddress, String userPreference , Integer franchiseId) {
        this.userId = userId;
        this.userName = userName;
        this.userMail = userMail;
        this.userAddress = userAddress;
        this.userPreference = userPreference;
        this.franchiseId = franchiseId;
    }

    // Getters and setters

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPreference() {
        return userPreference;
    }

    public void setUserPreference(String userPreference) {
        this.userPreference = userPreference;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
    }
}
