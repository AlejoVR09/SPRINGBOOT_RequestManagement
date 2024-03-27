package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.ProponentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProponentTypeRepository extends JpaRepository<ProponentType, Integer> {
}
