package com.example.demo.controllers.ProductController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService; // Corrigir o nome do serviço

@RestController // Define que a classe é um controlador RESTful
@RequestMapping("/product") // Define o endpoint base para este controlador
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/list")
    public Product getProduct(@RequestBody Product p) {
        return productService.getProductById(p.getId());
    }

    @PostMapping("/criar")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
