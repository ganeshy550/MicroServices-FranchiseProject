package com.example.RegionalManager.service;

import com.example.RegionalManager.dto.Franchisedto;
import com.example.RegionalManager.dto.Managerdto;
import com.example.RegionalManager.dto.Responsedto;
import com.example.RegionalManager.dto.Userdto;
import com.example.RegionalManager.model.Manager;
import com.example.RegionalManager.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepo repo;

    @Autowired
    private WebClient.Builder webclientBuilder;

    public Manager addManager(Manager manager){
        return repo.save(manager);
    }
    public Responsedto getManager(Integer managerId){
        Responsedto responsedto = new Responsedto();
        Manager manager = repo.findByManagerId(managerId).orElseThrow(()->new RuntimeException("Manager Not Found"));
        Managerdto managerdto = mapToManager(manager);

        List<Franchisedto> franchisedtoList = webclientBuilder.baseUrl("http://localhost:9099")
                .build()
                .get()
                .uri("/franchice/" + manager.getManagerId())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Franchisedto>>() {})
                .block();

        for (Franchisedto franchisedto : franchisedtoList) {
            List<Userdto> userdtoList = webclientBuilder.baseUrl("http://localhost:9094")
                    .build()
                    .get()
                    .uri("/userinfo/" + franchisedto.getFranchiseId())
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<Userdto>>() {})
                    .block();

            franchisedto.setUserdtoList(userdtoList);

        }
        responsedto.setManager(manager);
        responsedto.setFranchice(franchisedtoList);


        return responsedto;
    }

    private Managerdto mapToManager(Manager manager) {

        Managerdto dto = new Managerdto();
        dto.setManagerId(manager.getManagerId());
        dto.setManagerName(manager.getManagerName());
        dto.setManagerPh(manager.getManagerPh());
        dto.setManagerRegion(manager.getManagerRegion());
        dto.setManagermail(manager.getManagermail());
        return dto;
    }
}
