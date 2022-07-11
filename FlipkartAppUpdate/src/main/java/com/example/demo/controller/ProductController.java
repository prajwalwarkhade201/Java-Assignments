package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

import com.example.demo.globalexception.ProductExceptionController;


@RestController

public class ProductController {
	
	@Autowired
	ProductService ps;
	
//	@PostMapping(value = "/addproduct")
//	Product createproduct(@RequestBody Product product) {
//		return ps.createProduct(product);
//  }
	
	@PostMapping(value = "/addproduct")
	ResponseEntity<?> addNewProduct( @RequestBody Product product) {
		try {
			Product p = ps.createProduct(product);
			return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Something went wrong while adding Product."+e.getMessage(), 801);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@DeleteMapping(value = "/delete")
	ResponseEntity<?> deleteAllProducts() {
		try {
			ps.deleteAllProducts();
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Error is occuring while deleting Product list."+e.getMessage(), 802);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/getlistofproducts") 
	ResponseEntity<?> getListOfproducts() {

		//List<Product> resutedlist = ps.getListOfProducts();
		//return resutedlist;
		
		try {
			List<Product> Plist = ps.getListOfProducts();
			return new ResponseEntity<List<Product>>(Plist, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Getting error from Product list."+e.getMessage(), 804);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping(value="/getproductbyid/{id}") 
	 ResponseEntity<?>  getProductid(@PathVariable long id) {

		//Product resutedlist = ps.getProductById(id);
		//return resutedlist;
		
		try {
			Product p =ps.getProductById(id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This product id is not available."+e.getMessage(), 803);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	

	}
	
	@PutMapping(value="/updateproid/{id}")
	ResponseEntity<?> getUpdate(@PathVariable Long id, @RequestBody Product product) {

		//Product resutedlist = ps.updateProductById(product, id);
		//return resutedlist;
		
		try {
			Product p = ps.updateProductById(product, id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This product id is not available."+e.getMessage(), 805);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@GetMapping(value="/updatbyname/{name}")
	
	ResponseEntity<?> getUpdatename(@PathVariable String name){
		// List<Product> lp = ps.getProductByName(name);
		// return lp;
		try {
			List<Product> p =ps.getProductByName(name);
			return new ResponseEntity<List<Product>>(p,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This product name is not available."+e.getMessage(), 807);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
}