package com.example.demo.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.ProductNotFoundException;



@ControllerAdvice
public class ProductExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception) {
		
		 return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
	}

}
