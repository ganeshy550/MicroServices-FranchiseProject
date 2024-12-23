package com.example.FranchiseOwner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Responsedto {

    private Franchisedto franchisedto;

    private List<Userdto> userdtos;

    public Responsedto() {
    }

    public Responsedto(Franchisedto franchisedto, List<Userdto> userdtos) {
        this.franchisedto = franchisedto;
        this.userdtos = userdtos;
    }

    public Franchisedto getFranchisedto() {
        return franchisedto;
    }

    public void setFranchisedto(Franchisedto franchisedto) {
        this.franchisedto = franchisedto;
    }

    public List<Userdto> getUserdtos() {
        return userdtos;
    }

    public void setUserdtos(List<Userdto> userdtos) {
        this.userdtos = userdtos;
    }
}
