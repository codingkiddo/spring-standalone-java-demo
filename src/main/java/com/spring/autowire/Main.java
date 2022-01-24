package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext javaCtx = new AnnotationConfigApplicationContext(JavaConfigAutowire.class);
		Student s = javaCtx.getBean(Student.class);
		System.out.println(s.getDepartment().getName());
		((AnnotationConfigApplicationContext)javaCtx).close();
		
	}

}
