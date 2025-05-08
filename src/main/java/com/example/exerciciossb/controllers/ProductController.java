package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Delete e Create
    // Os dois métodos usam os mesmos parametros e processamentos
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Product newProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }

    // Read
    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    // Read por ID
    @GetMapping(path = "{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productRepository.findById(id);
    }

    @DeleteMapping(path = "{id}")
    public void deleteProduct(@PathVariable int id){
        productRepository.deleteById(id);
    }
}