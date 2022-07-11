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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entity.Product;
import com.example.demo.globalexception.ProductExceptionController;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping(value = "dept")

public class DepartmentController {
	
	@Autowired
	DepartmentService ds;
	
	@PostMapping(value = "/adddepartment")
	ResponseEntity<?> createDepartment(@RequestBody Department dept) {
	//	return ds.createDepartment(dept);
		
		try {
			Department d = ds.createDepartment(dept);
			return new ResponseEntity<Department>(d,HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Something went wrong while adding department."+e.getMessage(), 811);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(value = "/deletedept")
	ResponseEntity<?> deleteall() {
	//	ds.deleteAllDepartment();
		try {
			ds.deleteAllDepartment();
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Error is occuring while deleting Product department."+e.getMessage(), 812);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value="/getlistofdepartments") 
	ResponseEntity<?> getListOfdepartment() {

	//	List<Department> resutedlist = ds.getListOfDepartment();
	//	return resutedlist;
		
		try {
			List<Department> Dlist = ds.getListOfDepartment();
			return new ResponseEntity<List<Department>>(Dlist, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("Getting error from Product list."+e.getMessage(), 816);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping(value="/getdepartmentbyid/{id}") 
	 ResponseEntity<?>  getDepartmentid(@PathVariable long id) {

	//	Department resutedlist = ds.getDepartmentById(id);
	//	return resutedlist;
		
		try {
			Department d =ds.getDepartmentById(id);
			return new ResponseEntity<Department>(d, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This department id is not available"+e.getMessage(), 813);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	

	}
	
	@PutMapping(value="/update/{id}")
	ResponseEntity<?> getUpdate(@PathVariable Long id, @RequestBody Department dept) {

	//  Department resutedlist = ds.updateDepartmentById(dept, id);
	//	return resutedlist;
		
		try {
			Department d =ds.getDepartmentById(id);
			return new ResponseEntity<Department>(d, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This department id is not available"+e.getMessage(), 814);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}

	}
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/updatbyname/{name}")
	
	ResponseEntity<?> getUpdatename(@PathVariable String name){
	//	 List<Department> lp = ds.findingDepartmentsByName(name);
	//	return lp;
		
		try {
			List<Department> d =ds.findingDepartmentsByName(name);
			return new ResponseEntity<List<Department>>(d,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ProductExceptionController ce = new ProductExceptionController("This department name is not available."+e.getMessage(), 807);
			return new ResponseEntity<ProductExceptionController>(ce, HttpStatus.BAD_REQUEST);
		}
	}

}
