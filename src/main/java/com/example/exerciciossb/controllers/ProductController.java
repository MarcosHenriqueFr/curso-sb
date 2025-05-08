package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Pode passar diretamente o objeto, já que ele analisa o construtor da Entidade
    @PostMapping
    public @ResponseBody Product newProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }
}