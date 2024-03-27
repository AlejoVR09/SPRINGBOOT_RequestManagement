package com.example.RequestManagement.RequestManagement.Model.DTO;

public class ProponentTypeDTO {
    private String proponentTypeName;

    public ProponentTypeDTO() {
    }

    public ProponentTypeDTO(String proponentTypeName) {
        this.proponentTypeName = proponentTypeName;
    }

    public String getProponentTypeName() {
        return proponentTypeName;
    }

    public void setProponentTypeName(String proponentTypeName) {
        this.proponentTypeName = proponentTypeName;
    }
}
