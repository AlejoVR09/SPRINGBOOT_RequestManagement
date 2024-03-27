package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProposalDefinitionRepository extends JpaRepository<ProposalDefinition, Integer> {
}
