package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.ValueProposal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValueProposalRepository extends JpaRepository<ValueProposal, Integer> {
}
