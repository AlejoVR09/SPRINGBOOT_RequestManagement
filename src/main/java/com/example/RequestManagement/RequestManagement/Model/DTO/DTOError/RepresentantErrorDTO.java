package com.example.RequestManagement.RequestManagement.Model.DTO.DTOError;

public class RepresentantErrorDTO {
    private String message;

    public RepresentantErrorDTO() {
    }
    public RepresentantErrorDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
