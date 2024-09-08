package com.example.demo.resources;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ResourceRepository extends CrudRepository<Product, UUID> {
    // Métodos adicionais podem ser definidos aqui, se necessário
}