package com.example.FranchiseOwner.controller;

import com.example.FranchiseOwner.dto.Responsedto;
import com.example.FranchiseOwner.model.Franchise;
import com.example.FranchiseOwner.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/franchise")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @PostMapping("/addfranchise")
    public Franchise addNewFranchise(@RequestBody Franchise franchise){
        return franchiseService.addFranchise(franchise);
    }

    @GetMapping("/all")
    public List<Franchise> findAllFranchise(){
        return franchiseService.getAllFranchise();
    }

    @GetMapping("/all/{id}")
    public Franchise findFranchiseById(Integer id){
        return franchiseService.getFranchiseById(id).orElse(null);
    }

    @GetMapping("/userdetails/{franchiseId}")
    public Responsedto findFranchiseUser(@PathVariable Integer franchiseId){
        return franchiseService.getFranciseDetails(franchiseId);
    }

}
