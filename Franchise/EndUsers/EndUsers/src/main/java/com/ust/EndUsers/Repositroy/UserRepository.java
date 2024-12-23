package com.ust.EndUsers.Repositroy;

import com.ust.EndUsers.model.UserEntity;
import com.ust.EndUsers.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    List<UserEntity> findUserEntityByfranchiseId(Integer franchiseId);
}
