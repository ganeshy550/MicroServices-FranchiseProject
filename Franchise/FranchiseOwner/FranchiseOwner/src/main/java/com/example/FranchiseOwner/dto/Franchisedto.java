package com.example.FranchiseOwner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Franchisedto {

    private Integer franchiseId;

    private String franchiseOwnerName;

    private String franchiseLocation;

    private String status;

    public Franchisedto() {
    }

    public Franchisedto(Integer franchiseId, String franchiseLocation, String franchiseOwnerName, String status) {
        this.franchiseId = franchiseId;
        this.franchiseLocation = franchiseLocation;
        this.franchiseOwnerName = franchiseOwnerName;
        this.status = status;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getFranchiseLocation() {
        return franchiseLocation;
    }

    public void setFranchiseLocation(String franchiseLocation) {
        this.franchiseLocation = franchiseLocation;
    }

    public String getFranchiseOwnerName() {
        return franchiseOwnerName;
    }

    public void setFranchiseOwnerName(String franchiseOwnerName) {
        this.franchiseOwnerName = franchiseOwnerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
