package com.example.exerciciossb.controllers;

import com.example.exerciciossb.model.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Path direto no RequestMapping -> Serve como base para qualquer método
@RestController
@RequestMapping(path = "clientes")
public class UserController {

    // Retorna um JSON
    @GetMapping(path = "qualquer")
    public User getUser(){
        return new User(28, "Jorge Thomas", "123.456.789-00");
    }

    @GetMapping("{id}")
    public User getUserById1(@PathVariable int id){
        return new User(id, "Maria Julia", "897.657.123-00");
    }

    @GetMapping
    public User getUserById2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new User(id, "Jorge Amaro", "111.222.333-55");
    }
}
