package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int id;
	private String name;
	
	@Autowired
	private Department department;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
