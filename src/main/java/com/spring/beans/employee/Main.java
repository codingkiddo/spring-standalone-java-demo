package com.spring.beans.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext javaCtx = new AnnotationConfigApplicationContext(JavaConfigAop.class);
		EmployeeManager empMang = javaCtx.getBean(EmployeeManager.class);
		
		System.out.println(empMang.getEmployeeById(1));
		
		((AnnotationConfigApplicationContext)javaCtx).close();
		
	}

}
