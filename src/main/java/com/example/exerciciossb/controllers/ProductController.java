package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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

    // Consulta de Dados no Banco de todos os produtos, sem paginação
    // Não é uma boa Implementação
    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    // Consulta por ID
    @GetMapping(path = "{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productRepository.findById(id);
    }

    // Update do Produto com um novo metodo
    @PutMapping
    public Product updateProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }
}