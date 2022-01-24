package com.spring.beans.department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.spring.beans.employee.Employee;

public class Department {
    
    private long id;
    private String name;
    private Set<Employee> employees = new HashSet<Employee>();
    
	public Department() {
        super();
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}