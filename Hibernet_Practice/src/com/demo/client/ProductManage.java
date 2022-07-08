package com.demo.client;

import com.demo.entity.Product;
import com.demo.businesslogic.ProductRepo;

public class ProductManage {

	public static void main(String[] args) {

		Product record1 = new Product("sam","fair","red");
		Product record2 = new Product("iphone","good","red");
		Product record3 = new Product("mi","dark","red");
		Product record4 = new Product("moto","dark","red");
		
		ProductRepo.deleteProductByid(4);
		
	//	ProductRepo.createProduct(record3);
	//	ProductRepo.createProduct(record4);
		System.out.println("done");
		
		

	}

}