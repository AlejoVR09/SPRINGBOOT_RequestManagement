package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "proposalDefinition")
public class ProposalDefinition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String proposalDescription;
    private String descriptionActivities;
    private LocalDate startEventDate;
    private LocalDate presentation;
    private String proposalName;
    private String benefited;
    @ManyToOne
    @JoinColumn(name = "idProponent", referencedColumnName = "id")
    private Proponent proponent;
    @OneToOne
    @JoinColumn(name = "idValueProposal", referencedColumnName = "idValueProposal")
    private ValueProposal valueProposal;

    public ProposalDefinition() {
    }

    public ProposalDefinition(Integer id, String proposalDescription, String descriptionActivities, LocalDate startEventDate, LocalDate presentation, String proposalName, String benefited, Proponent proponent, ValueProposal valueProposal) {
        this.id = id;
        this.proposalDescription = proposalDescription;
        this.descriptionActivities = descriptionActivities;
        this.startEventDate = startEventDate;
        this.presentation = presentation;
        this.proposalName = proposalName;
        this.benefited = benefited;
        this.proponent = proponent;
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

    public Proponent getProponent() {
        return proponent;
    }

    public void setProponent(Proponent proponent) {
        this.proponent = proponent;
    }

    public ValueProposal getValueProposal() {
        return valueProposal;
    }

    public void setValueProposal(ValueProposal valueProposal) {
        this.valueProposal = valueProposal;
    }
}
