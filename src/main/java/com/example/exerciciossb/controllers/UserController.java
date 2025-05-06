package com.example.exerciciossb.controllers;

import com.example.exerciciossb.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
