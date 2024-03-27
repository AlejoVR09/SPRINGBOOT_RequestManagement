package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ProposalDocumentErrorDTO {
    private String message;

    public ProposalDocumentErrorDTO() {
    }
    public ProposalDocumentErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
