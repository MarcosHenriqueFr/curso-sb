package com.example.exerciciossb.model.repositories;

import com.example.exerciciossb.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// Não é possível usar tipos primitivos
// É uma abstração para manipulação com o banco de dados
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Iterable<Product> findByNameContainingIgnoreCase(String nameSection);

    @Query("SELECT p FROM products p WHERE p.name LIKE %:name%")
    public Iterable<Product> searchByNameLike(@Param("name") String name);
}
