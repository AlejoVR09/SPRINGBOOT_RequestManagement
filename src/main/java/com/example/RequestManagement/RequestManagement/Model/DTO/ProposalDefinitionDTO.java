package com.example.RequestManagement.RequestManagement.Model.DTO;

import java.time.LocalDate;

public class ProposalDefinitionDTO {
    private Integer id;
    private String proposalDescription;
    private String descriptionActivities;
    private LocalDate startEventDate;
    private LocalDate presentation;
    private String proposalName;
    private String benefited;
    private String proponentName;
    private Double valueProposal;

    public ProposalDefinitionDTO() {
    }

    public ProposalDefinitionDTO(Integer id, String proposalDescription, String descriptionActivities, LocalDate startEventDate, LocalDate presentation, String proposalName, String benefited, String proponentName, Double valueProposal) {
        this.id = id;
        this.proposalDescription = proposalDescription;
        this.descriptionActivities = descriptionActivities;
        this.startEventDate = startEventDate;
        this.presentation = presentation;
        this.proposalName = proposalName;
        this.benefited = benefited;
        this.proponentName = proponentName;
        this.valueProposal = valueProposal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProposalDescription() {
        return proposalDescription;
    }

    public void setProposalDescription(String proposalDescription) {
        this.proposalDescription = proposalDescription;
    }

    public String getDescriptionActivities() {
        return descriptionActivities;
    }

    public void setDescriptionActivities(String descriptionActivities) {
        this.descriptionActivities = descriptionActivities;
    }

    public LocalDate getStartEventDate() {
        return startEventDate;
    }

    public void setStartEventDate(LocalDate startEventDate) {
        this.startEventDate = startEventDate;
    }

    public LocalDate getPresentation() {
        return presentation;
    }

    public void setPresentation(LocalDate presentation) {
        this.presentation = presentation;
    }

    public String getProposalName() {
        return proposalName;
    }

    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }

    public String getBenefited() {
        return benefited;
    }

    public void setBenefited(String benefited) {
        this.benefited = benefited;
    }

    public String getProponentName() {
        return proponentName;
    }

    public void setProponentName(String proponentName) {
        this.proponentName = proponentName;
    }

    public Double getValueProposal() {
        return valueProposal;
    }

    public void setValueProposal(Double valueProposal) {
        this.valueProposal = valueProposal;
    }
}
