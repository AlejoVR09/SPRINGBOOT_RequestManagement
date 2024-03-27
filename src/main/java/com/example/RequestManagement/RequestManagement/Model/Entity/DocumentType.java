package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "documentType")
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocumentType;
    @Column(name = "documentTypeName")
    private String documentTypeName;

    public DocumentType(Integer idDocumentType, String documentTypeName) {
        this.idDocumentType = idDocumentType;
        this.documentTypeName = documentTypeName;
    }

    public DocumentType() {
    }

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
