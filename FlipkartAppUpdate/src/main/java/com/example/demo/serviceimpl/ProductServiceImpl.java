package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Service

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo pr;
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return pr.save(product);
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		pr.deleteAll();
	}
	

	@Override
	public Product updateProductById(Product product, long id) {
		// TODO Auto-generated method stub
		Product p = pr.findById(id).get();
		p.setDescr(product.getDescr());
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setBrand(product.getBrand());
		p.setRatings(product.getRatings());
		pr.save(p);
		return p;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		
		pr.deleteById(id);
		
	}

	@Override
	public List<Product> getListOfProducts() {
		// TODO Auto-generated method stub
		//return null;
		List<Product> resultedlist = pr.findAll();
		
		return resultedlist;
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		Product p = pr.findById(id).get();
		
		return p;
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> lp = pr.getProductByName(name);
		
		return lp;
	}


	
	
	

}
