package com.example.RequestManagement.RequestManagement.Model.DTO;

public class RepresentantDTO {
    private Integer id;
    private String document;
    private String email;
    private String name;
    private String lastName;
    private String phone;
    private String documentTypeName;

    public RepresentantDTO() {
    }

    public RepresentantDTO(Integer id, String document, String email, String name, String lastName, String phone, String documentTypeName) {
        this.id = id;
        this.document = document;
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.documentTypeName = documentTypeName;
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

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }
}
