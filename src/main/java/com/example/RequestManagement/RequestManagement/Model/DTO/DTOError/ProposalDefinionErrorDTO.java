package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ProposalDefinionErrorDTO {
    private String message;

    public ProposalDefinionErrorDTO() {
    }
    public ProposalDefinionErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
