package com.example.RequestManagement.RequestManagement.Model.DTO;

public class ProposalDocumentDTO {
    private String attachedDocumentUrl;
    private String proposalDefinitionDescription;


    public ProposalDocumentDTO() {
    }

    public ProposalDocumentDTO(String attachedDocumentUrl, String proposalDefinitionDescription) {
        this.attachedDocumentUrl = attachedDocumentUrl;
        this.proposalDefinitionDescription = proposalDefinitionDescription;
    }

    public String getAttachedDocumentUrl() {
        return attachedDocumentUrl;
    }

    public void setAttachedDocumentUrl(String attachedDocumentUrl) {
        this.attachedDocumentUrl = attachedDocumentUrl;
    }

    public String getProposalDefinitionDescription() {
        return proposalDefinitionDescription;
    }

    public void setProposalDefinitionDescription(String proposalDefinitionDescription) {
        this.proposalDefinitionDescription = proposalDefinitionDescription;
    }
}
