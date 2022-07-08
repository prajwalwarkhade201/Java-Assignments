package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repo.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@Service

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository dr;
	@Override
	public Department createDepartment(Department dept) {
		// TODO Auto-generated method stub
		
		
		return dr.save(dept);
	}

	@Override
	public void deleteAllDepartment() {
		// TODO Auto-generated method stub
		
		dr.deleteAll();
		
	}

	@Override
	public Department updateDepartmentById(Department dept, long id) {
		// TODO Auto-generated method stub
		Department d = dr.findById(id).get();
		d.setDept_name(dept.getDept_name());
		d.setDept_disc(dept.getDept_discr());
		dr.save(d);
		
		return d;
	}

	@Override
	public void deleteDepartmentById(long id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
		
	}

	@Override
	public List<Department> findingDepartmentsByName(String name) {
		// TODO Auto-generated method stub
		List<Department> ld = dr.findDepartmentByName(name);
		
		
		
		return ld;
	}

	@Override
	public Department getDepartmentById(long id) {
		// TODO Auto-generated method stub
		Department d = dr.findById(id).get();
		
		return d;
	}

	@Override
	public List<Department> getListOfDepartment() {
		// TODO Auto-generated method stub
		List<Department> ld = dr.findAll();
		
		return ld;
	}
	
	

}
