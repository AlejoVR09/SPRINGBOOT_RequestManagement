package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class ProponentErrorDTO {
    private String message;

    public ProponentErrorDTO() {
    }
    public ProponentErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
