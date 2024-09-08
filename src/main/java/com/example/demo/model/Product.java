package com.example.demo.model;

import java.util.UUID;

public class Product {

    // Atributos
    private UUID id;
    private String name;

    // Get & Set
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }  

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
