package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/products")
public class ProductController {

    @PostMapping
    public @ResponseBody Product newProduct(@RequestParam String name){
        return new Product(name);
    }
}
