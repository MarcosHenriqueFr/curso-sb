package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

// Não é possível usar tipos primitivos
public interface ProductRepository extends CrudRepository<Product, Integer> {


}
