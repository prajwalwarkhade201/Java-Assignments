package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Table
@Entity

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String dept_name;

	private String dept_discr;
	
	
	public Department() {
		
	}

	public Department(String dept_name, String dept_discr) {
		super();
		this.dept_name = dept_name;
		this.dept_discr = dept_discr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_discr() {
		return dept_discr;
	}

	public void setDept_disc(String dept_discr) {
		this.dept_discr = dept_discr;
	}

	
	

}