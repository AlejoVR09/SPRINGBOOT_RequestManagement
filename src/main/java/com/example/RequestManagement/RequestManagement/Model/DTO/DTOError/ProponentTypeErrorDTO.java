package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ProponentTypeErrorDTO {
    private String message;

    public ProponentTypeErrorDTO() {
    }
    public ProponentTypeErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
