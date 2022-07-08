package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long>  {

	@Query(value = "SELECT p FROM Product p WHERE p.name =?1")
    List<Product> getProductByName(String name);
}
