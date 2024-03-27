package com.example.RequestManagement.RequestManagement.Model.DTO;

public class ProponentDTO {
    private Integer id;
    private String name;
    private String description;
    private String representantName;
    private String documentType;
    private String proponentTypeName;

    public ProponentDTO() {
    }

    public ProponentDTO(Integer id, String name, String description, String representantName, String documentType, String proponentTypeName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.representantName = representantName;
        this.documentType = documentType;
        this.proponentTypeName = proponentTypeName;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRepresentantName() {
        return representantName;
    }

    public void setRepresentantName(String representantName) {
        this.representantName = representantName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getProponentTypeName() {
        return proponentTypeName;
    }

    public void setProponentTypeName(String proponentTypeName) {
        this.proponentTypeName = proponentTypeName;
    }
}
