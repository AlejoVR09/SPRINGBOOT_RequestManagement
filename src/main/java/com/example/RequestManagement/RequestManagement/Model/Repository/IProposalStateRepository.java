package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProposalStateRepository extends JpaRepository<ProposalState, Integer> {
}
