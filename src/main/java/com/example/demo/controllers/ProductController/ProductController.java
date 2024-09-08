package com.example.demo.controllers.ProductController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define que a classe é um controlador RESTful
@RequestMapping("/product") // Define o endpoint base para este controlador
public class ProductController {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/list")
    public String list() {
        return "Hello World!";
    }
}
