package com.example.RequestManagement.RequestManagement.Model.Entity;

import com.example.RequestManagement.RequestManagement.Utility.States;
import jakarta.persistence.*;

@Entity
@Table(name = "proposalState")
public class ProposalState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private States states;

    public ProposalState() {
    }

    public ProposalState(Integer id, States states) {
        this.id = id;
        this.states = states;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }
}
