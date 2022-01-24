package com.spring.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.beans.department.Department;
import com.spring.beans.employee.Employee;
import com.spring.beans.employee.EmployeeManager;

@Configuration
public class JavaConfig {

	private Employee employee;
	private EmployeeManager employeeManager;
	private Department department;
	
	@Bean
	@Scope("prototype")
	public Employee getEmployee() {
		employee = new Employee();
		return employee;
	}
	
	@Bean
	public EmployeeManager getEmployeeManager() {
		employeeManager = new EmployeeManager();
		return employeeManager;
	}
	
	@Bean
	public Department getDepartment() {
		department = new Department();
		department.setId(12121212);
		department.setName("Dept1");
		Set<Employee> employees = new HashSet<Employee>();
		Employee e1 = getEmployee();
		Employee e2 = getEmployee();
		employees.add(e1);
		employees.add(e2);
		department.setEmployees(employees);
		return department;
	}
}
