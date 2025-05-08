package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Não é possível usar tipos primitivos
// É uma abstração para manipulação com o banco de dados
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Iterable<Product> findByNameContainingIgnoreCase(String nameSection);
}
