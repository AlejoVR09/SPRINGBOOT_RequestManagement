package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "valueProposal")
public class ValueProposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idValueProposal;
    private Double comfamaValue;
    private Double totalValue;

    public ValueProposal() {
    }

    public ValueProposal(Integer idValueProposal, Double comfamaValue, Double totalValue) {
        this.idValueProposal = idValueProposal;
        this.comfamaValue = comfamaValue;
        this.totalValue = totalValue;
    }

    public Integer getIdValueProposal() {
        return idValueProposal;
    }

    public void setIdValueProposal(Integer idValueProposal) {
        this.idValueProposal = idValueProposal;
    }

    public Double getComfamaValue() {
        return comfamaValue;
    }

    public void setComfamaValue(Double comfamaValue) {
        this.comfamaValue = comfamaValue;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
