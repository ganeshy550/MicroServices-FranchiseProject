package com.example.RegionalManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Manager {

    @Id
    private Integer managerId;
    private String managerName;
    private String managermail;
    private Long managerPh;
    private String managerRegion;

    private Integer franchiseId;

    public Manager() {
    }

    public Manager(Integer franchiseId, Integer managerId, String managermail, String managerName, Long managerPh, String managerRegion) {
        this.franchiseId = franchiseId;
        this.managerId = managerId;
        this.managermail = managermail;
        this.managerName = managerName;
        this.managerPh = managerPh;
        this.managerRegion = managerRegion;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagermail() {
        return managermail;
    }

    public void setManagermail(String managermail) {
        this.managermail = managermail;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Long getManagerPh() {
        return managerPh;
    }

    public void setManagerPh(Long managerPh) {
        this.managerPh = managerPh;
    }

    public String getManagerRegion() {
        return managerRegion;
    }

    public void setManagerRegion(String managerRegion) {
        this.managerRegion = managerRegion;
    }
}
