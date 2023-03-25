package com.example.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("live");
		context.register(AppConfig.class);
		
		context.refresh();
		
		context.close();
		
	}

}
