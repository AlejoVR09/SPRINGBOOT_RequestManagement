package com.example.RequestManagement.RequestManagement.Model.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proponentType")
public class ProponentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String proponentTypeName;

    public ProponentType() {
    }

    public ProponentType(Integer id, String proponentTypeName) {
        this.id = id;
        this.proponentTypeName = proponentTypeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProponentTypeName() {
        return proponentTypeName;
    }

    public void setProponentTypeName(String proponentType) {
        this.proponentTypeName = proponentType;
    }
}
