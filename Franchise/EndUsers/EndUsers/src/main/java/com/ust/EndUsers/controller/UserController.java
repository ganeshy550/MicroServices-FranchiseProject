package com.ust.EndUsers.controller;

import com.ust.EndUsers.model.UserEntity;
import com.ust.EndUsers.model.UserEntity;
import com.ust.EndUsers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public UserEntity addUsers(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public UserEntity findUserById(@PathVariable int id){
        return userService.getUserById(id).orElse(null);
    }

    @GetMapping("/allUsers")
    public List<UserEntity> findAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/allUserByFranchise/{franchiseId}")
    public List<UserEntity> findAllUserByFranchise(@PathVariable Integer franchiseId){
        return userService.getUserByFranchise(franchiseId);
    }

}
