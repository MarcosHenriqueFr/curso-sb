package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Product;
import com.example.exerciciossb.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {

    // Coloca um objeto por meio do Spring
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(@RequestParam String name,
                                            @RequestParam double price,
                                            @RequestParam double discount){

        Product product = new Product(name, price, discount);
        productRepository.save(product);
        return product;
    }
}