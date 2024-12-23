package com.example.FranchiseOwner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Franchise {

    @Id
    private Integer franchiseId;

    private String franchiseOwnerName;

    private String franchiseLocation;

    private String businessName;

    private Long taxIdentificationNumber;

    private String status;

    public Franchise() {
    }

    public Franchise(String franchiseLocation, String businessName, Integer franchiseId, String franchiseOwnerName, String status, Long taxIdentificationNumber) {
        this.franchiseLocation = franchiseLocation;
        this.businessName = businessName;
        this.franchiseId = franchiseId;
        this.franchiseOwnerName = franchiseOwnerName;
        this.status = status;
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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

    public Long getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(Long taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
