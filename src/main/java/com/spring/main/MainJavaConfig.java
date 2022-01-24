package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.department.Department;
import com.spring.beans.employee.EmployeeManager;
import com.spring.config.JavaConfig;

public class MainJavaConfig {

	public static void main(String[] args) {
		ApplicationContext javaCtx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Department department = javaCtx.getBean(Department.class);
		System.out.println(department.getName());
		System.out.println(department.getEmployees().size());
		
//		EmployeeManager employeeManager = javaCtx.getBean(EmployeeManager.class);
//		employeeManager.getAllEmployee();
		
		((AnnotationConfigApplicationContext)javaCtx).close();
	}
}
