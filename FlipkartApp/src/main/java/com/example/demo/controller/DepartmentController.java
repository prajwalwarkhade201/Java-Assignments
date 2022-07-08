package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping()

public class DepartmentController {
	
	@Autowired
	DepartmentService ds;
	
	@PostMapping(value = "/adddepartment")
	Department createdepartment(@RequestBody Department dept) {
		return ds.createDepartment(dept);
	}
	
	@DeleteMapping(value = "/delete")
	void deleteall() {
		ds.deleteAllDepartment();
	}
	
	@GetMapping(value="/getlistofdepartments") 
	List<Department> getListOfdepartment() throws ProductNotFoundException{

		List<Department> resutedlist = ds.getListOfDepartment();
		return resutedlist;

	}
	
	@GetMapping(value="/getdepartmentbyid/{id}") 
	 Department  getDepartmentid(@PathVariable long id) {

		Department resutedlist = ds.getDepartmentById(id);
		return resutedlist;
	

	}
	
	@PutMapping(value="/update/{id}")
	Department getUpdate(@PathVariable Long id, @RequestBody Department dept) {

		Department resutedlist = ds.updateDepartmentById(dept, id);
		return resutedlist;

	}
	
	@GetMapping(value="/updatbyname/{name}")
	
	List<Department> getUpdatename(@PathVariable String name){
		 List<Department> lp = ds.findingDepartmentsByName(name);
		return lp;
	}

}
