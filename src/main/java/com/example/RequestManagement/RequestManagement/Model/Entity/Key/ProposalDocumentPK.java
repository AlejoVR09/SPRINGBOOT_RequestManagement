package com.example.RequestManagement.RequestManagement.Model.Entity.Key;

import java.io.Serializable;
import java.util.Objects;

public class ProposalDocumentPK implements Serializable {
    private Integer attachedDocument; // Debe coincidir con el nombre del atributo en ProposalDocument
    private Integer proposalDefinition; // Debe coincidir con el nombre del atributo en ProposalDocument

    public ProposalDocumentPK() {
    }

    public ProposalDocumentPK(Integer attachedDocument, Integer proposalDefinition) {
        this.attachedDocument = attachedDocument;
        this.proposalDefinition = proposalDefinition;
    }

    public Integer getAttachedDocument() {
        return attachedDocument;
    }

    public void setAttachedDocument(Integer attachedDocument) {
        this.attachedDocument = attachedDocument;
    }

    public Integer getProposalDefinition() {
        return proposalDefinition;
    }

    public void setProposalDefinition(Integer proposalDefinition) {
        this.proposalDefinition = proposalDefinition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProposalDocumentPK that = (ProposalDocumentPK) o;
        return Objects.equals(attachedDocument, that.attachedDocument) && Objects.equals(proposalDefinition, that.proposalDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedDocument, proposalDefinition);
    }
}
