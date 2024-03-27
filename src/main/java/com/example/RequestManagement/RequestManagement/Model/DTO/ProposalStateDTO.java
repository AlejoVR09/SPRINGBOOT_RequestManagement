package com.example.RequestManagement.RequestManagement.Model.DTO;

import com.example.RequestManagement.RequestManagement.Utility.States;

public class ProposalStateDTO {

    private Integer id;
    private String state;

    public ProposalStateDTO() {
    }

    public ProposalStateDTO(Integer id, String state) {
        this.id = id;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
