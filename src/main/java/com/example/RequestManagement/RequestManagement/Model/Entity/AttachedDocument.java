package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "attachedDocument")
public class AttachedDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocument;
    private String urlDocument;
    private String documentName;

    public AttachedDocument() {
    }

    public AttachedDocument(Integer idDocument, String urlDocument, String documentName) {
        this.idDocument = idDocument;
        this.urlDocument = urlDocument;
        this.documentName = documentName;
    }

    public Integer getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public String getUrlDocument() {
        return urlDocument;
    }

    public void setUrlDocument(String urlDocument) {
        this.urlDocument = urlDocument;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }
}
