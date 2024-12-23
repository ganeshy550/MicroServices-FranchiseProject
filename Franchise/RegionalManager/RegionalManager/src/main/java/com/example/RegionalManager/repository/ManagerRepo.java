package com.example.RegionalManager.repository;

import com.example.RegionalManager.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManagerRepo extends JpaRepository<Manager, Integer> {
    Optional<Manager> findByManagerId(Integer managerId);


}
