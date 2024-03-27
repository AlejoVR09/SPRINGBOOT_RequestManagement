package com.example.RequestManagement.RequestManagement.Model.Repository;

import com.example.RequestManagement.RequestManagement.Model.Entity.Key.ProposalDocumentPK;
import com.example.RequestManagement.RequestManagement.Model.Entity.ProposalDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProposalDocumentRepository extends JpaRepository<ProposalDocument, ProposalDocumentPK> {

}
