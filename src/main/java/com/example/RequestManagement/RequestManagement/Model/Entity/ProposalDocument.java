package com.example.RequestManagement.RequestManagement.Model.Entity;

import com.example.RequestManagement.RequestManagement.Model.Entity.Key.ProposalDocumentPK;
import jakarta.persistence.*;

@Entity
@Table(name = "proposalDocument")
@IdClass(ProposalDocumentPK.class)
public class ProposalDocument {
    @Id
    @ManyToOne
    @JoinColumn(name = "idAttachedDocument", referencedColumnName = "idDocument")
    private AttachedDocument attachedDocument;

    @Id
    @ManyToOne
    @JoinColumn(name = "idProposalDefinition", referencedColumnName = "id")
    private ProposalDefinition proposalDefinition;

    @OneToOne
    @JoinColumn(name = "idProposalState", referencedColumnName = "id")
    private ProposalState proposalState;

    public ProposalDocument() {
    }

    public ProposalDocument(AttachedDocument attachedDocument, ProposalDefinition proposalDefinition) {
        this.attachedDocument = attachedDocument;
        this.proposalDefinition = proposalDefinition;
    }

    public AttachedDocument getAttachedDocument() {
        return attachedDocument;
    }

    public void setAttachedDocument(AttachedDocument attachedDocument) {
        this.attachedDocument = attachedDocument;
    }

    public ProposalDefinition getProposalDefinition() {
        return proposalDefinition;
    }

    public void setProposalDefinition(ProposalDefinition proposalDefinition) {
        this.proposalDefinition = proposalDefinition;
    }

    public ProposalState getProposalState() {
        return proposalState;
    }

    public void setProposalState(ProposalState proposalState) {
        this.proposalState = proposalState;
    }
}
