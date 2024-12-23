package com.example.FranchiseOwner.Repository;

import com.example.FranchiseOwner.model.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FranchiseRepo extends JpaRepository<Franchise,Integer> {

}
