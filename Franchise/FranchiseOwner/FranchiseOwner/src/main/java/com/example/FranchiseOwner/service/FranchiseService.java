package com.example.FranchiseOwner.service;

import com.example.FranchiseOwner.Repository.FranchiseRepo;
import com.example.FranchiseOwner.dto.Franchisedto;
import com.example.FranchiseOwner.dto.Responsedto;
import com.example.FranchiseOwner.dto.Userdto;
import com.example.FranchiseOwner.model.Franchise;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.List;
import java.util.Optional;

@Service
public class FranchiseService {

    @Autowired
    private FranchiseRepo franchiseRepo;

    @Autowired
    private WebClient webClient;

    public Franchise addFranchise(Franchise franchise){
        return franchiseRepo.save(franchise);
    }

    public Optional<Franchise> getFranchiseById(Integer id){
        return franchiseRepo.findById(id);
    }

    public List<Franchise> getAllFranchise(){
        return franchiseRepo.findAll();
    }

    @CircuitBreaker(name = "franchiseService", fallbackMethod = "fallbackGetFranchise")
    public Responsedto getFranciseDetails(Integer franchiseId){
        Responsedto responsedto = new Responsedto();
        Franchise franchise = franchiseRepo.findById(franchiseId).orElseThrow(() -> new RuntimeException("Franchise not found"));
        Franchisedto franchisedto = mapToFranchisedto(franchise);

        List<Userdto> userdtos = webClient.get()
                .uri("http://localhost:9094/userinfo/allUserByFranchise/" +franchise.getFranchiseId())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Userdto>>(){})
                        .block();

        responsedto.setFranchisedto(franchisedto);
        responsedto.setUserdtos(userdtos);

        return responsedto;




    }

    public Responsedto fallbackGetFranchise(Integer franchiseId, Throwable throwable) {
        // Handle the fallback logic, e.g., return a default response or log the error
        return new Responsedto(); // Return an empty response or a default response
    }

    public Franchisedto mapToFranchisedto(Franchise franchise){
        Franchisedto franchisedto = new Franchisedto();
        franchisedto.setFranchiseId(franchise.getFranchiseId());
        franchisedto.setFranchiseLocation(franchise.getFranchiseLocation());
        franchisedto.setStatus(franchise.getStatus());
        franchisedto.setFranchiseOwnerName(franchise.getFranchiseOwnerName());

        return franchisedto;
    }



}
