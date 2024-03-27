package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "representant")
public class Representant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String document;
    private String email;
    private String name;
    private String lastName;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "idDocumentType", referencedColumnName = "idDocumentType")
    private DocumentType documentType;

    public Representant() {
    }

    public Representant(Integer id, String document, String email, String name, String lastName, String phone, DocumentType documentType) {
        this.id = id;
        this.document = document;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.documentType = documentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }
}
