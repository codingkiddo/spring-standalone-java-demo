package com.spring.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigAutowire {

	private Department department;
	private Student student;
	
	@Bean
	public Student getStudent() {
		student = new Student();
		student.setId(1);
		student.setName("S1");
		return student;
	}
	
	@Bean
	public Department getDepartment() {
		department = new Department();
		department.setId(12121212);
		department.setName("Dept1");
		return department;
	}
}
