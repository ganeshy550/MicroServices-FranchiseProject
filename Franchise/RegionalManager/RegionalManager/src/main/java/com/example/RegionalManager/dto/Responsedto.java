package com.example.RegionalManager.dto;

import com.example.RegionalManager.model.Manager;

import java.util.List;

public class Responsedto {

    private Manager manager;
    private List<Franchisedto> franchice;

    public Responsedto() {
    }

    public Responsedto(List<Franchisedto> franchice, Manager manager) {
        this.franchice = franchice;
        this.manager = manager;
    }

    public List<Franchisedto> getFranchice() {
        return franchice;
    }

    public void setFranchice(List<Franchisedto> franchice) {
        this.franchice = franchice;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
