package com.spring.scopedproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfig {

	public static void main(String[] args) {
		ApplicationContext javaCtx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SingletonScopedBean singletonScopedBean = javaCtx.getBean(SingletonScopedBean.class);
		System.out.println(singletonScopedBean.getState());
		System.out.println(singletonScopedBean.getState());
		System.out.println(singletonScopedBean.getState());
		
		((AnnotationConfigApplicationContext)javaCtx).close();
	}
}
