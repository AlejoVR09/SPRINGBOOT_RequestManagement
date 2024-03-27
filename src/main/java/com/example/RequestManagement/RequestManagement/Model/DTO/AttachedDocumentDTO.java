package com.example.RequestManagement.RequestManagement.Model.DTO;

public class AttachedDocumentDTO {
    private String urlDocument;
    private String documentName;

    public AttachedDocumentDTO() {
    }

    public AttachedDocumentDTO(String urlDocument, String documentName) {
        this.urlDocument = urlDocument;
        this.documentName = documentName;
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
