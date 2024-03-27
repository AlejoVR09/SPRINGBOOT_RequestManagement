package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ValueProposalErrorDTO {
    private String message;

    public ValueProposalErrorDTO() {
    }
    public ValueProposalErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
