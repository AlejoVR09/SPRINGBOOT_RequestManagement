package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.Proponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProponentRepository extends JpaRepository<Proponent, Integer> {
}
