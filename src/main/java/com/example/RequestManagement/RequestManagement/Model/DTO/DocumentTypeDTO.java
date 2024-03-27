package com.example.RequestManagement.RequestManagement.Model.DTO;

import lombok.Data;

import java.time.LocalDate;


public class DocumentTypeDTO {
    private Integer idDocumentType;
    private String documentTypeName;

    public Integer getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(Integer idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }
}
