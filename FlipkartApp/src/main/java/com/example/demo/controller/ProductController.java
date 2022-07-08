package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import com.example.demo.exception.ProductNotFoundException;


@RestController

public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping(value = "/addproduct")
	Product createproduct(@RequestBody Product product) {
		return ps.createProduct(product);
	}
	
	@DeleteMapping(value = "/delete")
	void deleteall() {
		ps.deleteAllProducts();
	}
	
	@GetMapping(value="/getlistofproducts") 
	List<Product> getListOfproducts() throws ProductNotFoundException{

		List<Product> resutedlist = ps.getListOfProducts();
		return resutedlist;

	}
	
	@GetMapping(value="/getproductbyid/{id}") 
	 Product  getProductid(@PathVariable long id) {

		Product resutedlist = ps.getProductById(id);
		return resutedlist;
	

	}
	
	@PutMapping(value="/updateproid/{id}")
	Product getUpdate(@PathVariable Long id, @RequestBody Product product) {

		Product resutedlist = ps.updateProductById(product, id);
		return resutedlist;

	}
	
	@GetMapping(value="/updatbyname/{name}")
	
	List<Product> getUpdatename(@PathVariable String name){
		 List<Product> lp = ps.getProductByName(name);
		return lp;
	}
	
}