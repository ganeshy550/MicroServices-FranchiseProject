package com.ust.EndUsers.service;

import com.ust.EndUsers.Repositroy.UserRepository;
import com.ust.EndUsers.model.UserEntity;
import com.ust.EndUsers.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity addUser(UserEntity user){
        return userRepository.save(user);
    }

    public Optional<UserEntity> getUserById(int id){

        return userRepository.findById(id);
    }

    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }

    public List<UserEntity> getUserByFranchise(Integer franchiseId){
        return userRepository.findUserEntityByfranchiseId(franchiseId);
    }


}
