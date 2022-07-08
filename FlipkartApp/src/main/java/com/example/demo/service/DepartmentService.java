package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
	
	Department createDepartment(Department dept);
	
	void deleteAllDepartment();
	
	Department updateDepartmentById(Department dept, long id);
	
	void deleteDepartmentById(long id);
	
	List<Department> findingDepartmentsByName(String name);
	
	Department getDepartmentById(long id);
	
	List<Department> getListOfDepartment();

}
