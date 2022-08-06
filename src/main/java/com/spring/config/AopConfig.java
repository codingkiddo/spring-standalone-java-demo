package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.beans.Employee;
import com.spring.service.EmployeeService;

@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setName("Dummy Name");
		return employee;
	}
	
	@Bean
	public EmployeeService employeeService() {
		EmployeeService employeeService = new EmployeeService();
		employeeService.setEmployee(employee());
		return employeeService;
	}
}
