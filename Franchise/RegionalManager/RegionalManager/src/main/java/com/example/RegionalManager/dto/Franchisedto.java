package com.example.RegionalManager.dto;

import java.util.List;

public class Franchisedto {

    private Integer franchiseId;

    private String franchiseOwnerName;

    private String franchiseLocation;

    private String businessName;

    private Long taxIdentificationNumber;

    private String status;

    private List<Userdto> userdtoList;

    public Franchisedto() {
    }

    public Franchisedto(String businessName, Integer franchiseId, String franchiseLocation, String franchiseOwnerName, String status, Long taxIdentificationNumber, List<Userdto> userdtoList) {
        this.businessName = businessName;
        this.franchiseId = franchiseId;
        this.franchiseLocation = franchiseLocation;
        this.franchiseOwnerName = franchiseOwnerName;
        this.status = status;
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.userdtoList = userdtoList;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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

    public Long getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(Long taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public List<Userdto> getUserdtoList() {
        return userdtoList;
    }

    public void setUserdtoList(List<Userdto> userdtoList) {
        this.userdtoList = userdtoList;
    }
}
