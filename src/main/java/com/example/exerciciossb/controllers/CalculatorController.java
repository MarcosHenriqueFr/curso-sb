package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculator")
public class CalculatorController {

    // /calculator/sum/10/20
    // /calculator/subtract?a=10&b=20

    @GetMapping(path = "sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    @GetMapping(path = "subtract")
    public int subtract(
            @RequestParam(name = "a", defaultValue = "1") int a,
            @RequestParam(name = "b", defaultValue = "1") int b)
    {
        return a - b;
    }
}
