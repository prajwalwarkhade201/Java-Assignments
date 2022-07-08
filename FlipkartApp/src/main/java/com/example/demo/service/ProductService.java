package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);

    void deleteAllProducts();

    Product updateProductById(Product product, long id);

    void deleteProductById(long id);

    List<Product> getListOfProducts();

    Product getProductById(long id);

 
    
    List<Product> getProductByName(String name);

}
