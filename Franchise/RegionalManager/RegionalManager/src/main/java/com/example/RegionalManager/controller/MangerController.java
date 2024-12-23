package com.example.RegionalManager.controller;

import com.example.RegionalManager.dto.Responsedto;
import com.example.RegionalManager.model.Manager;
import com.example.RegionalManager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class MangerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping("/addManager")
    public ResponseEntity<Manager> addManager(@RequestBody Manager airline){
        return ResponseEntity.ok(managerService.addManager(airline));
    }

    @GetMapping("{managerId}")
    public ResponseEntity<Responsedto> getUser(@PathVariable("managerId") Integer managerId ){
        Responsedto responseDto = managerService.getManager(managerId);
        return ResponseEntity.ok(responseDto);
    }

}
