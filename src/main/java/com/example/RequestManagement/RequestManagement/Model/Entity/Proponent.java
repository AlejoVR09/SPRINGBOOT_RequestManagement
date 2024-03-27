package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proponent")
public class Proponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String document;
    private String description;
    @ManyToOne
    @JoinColumn(name = "idRepresentant", referencedColumnName = "id")
    private Representant representant;
    @ManyToOne
    @JoinColumn(name = "idDocumentType", referencedColumnName = "idDocumentType")
    private DocumentType documentType;
    @ManyToOne
    @JoinColumn(name = "idProponentType", referencedColumnName = "id")
    private ProponentType proponentType;

    public Proponent() {
    }

    public Proponent(Integer id, String name, String document, String description, Representant representant, DocumentType documentType, ProponentType proponentType) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.description = description;
        this.representant = representant;
        this.documentType = documentType;
        this.proponentType = proponentType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Representant getRepresentant() {
        return representant;
    }

    public void setRepresentant(Representant representant) {
        this.representant = representant;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public ProponentType getProponentType() {
        return proponentType;
    }

    public void setProponentType(ProponentType proponentType) {
        this.proponentType = proponentType;
    }
}
