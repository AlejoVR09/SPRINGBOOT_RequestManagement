package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ProposalStateErrorDTO {
    private String message;

    public ProposalStateErrorDTO() {
    }
    public ProposalStateErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
