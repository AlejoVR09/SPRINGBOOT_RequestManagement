package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class DocumentTypeErrorDTO {
    private String message;

    public DocumentTypeErrorDTO() {
    }
    public DocumentTypeErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
