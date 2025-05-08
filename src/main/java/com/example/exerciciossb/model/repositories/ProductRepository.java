package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

// Não é possível usar tipos primitivos
// É uma abstração para manipulação com o banco de dados
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
