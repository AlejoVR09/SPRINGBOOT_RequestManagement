package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class AttachedDocumentErrorDTO {
    private String message;
    public AttachedDocumentErrorDTO() {
    }
    public AttachedDocumentErrorDTO(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
