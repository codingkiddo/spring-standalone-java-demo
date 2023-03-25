package com.habuma.restfun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("magic");
		context.register(MagicConfig.class);
		
		context.refresh();
		
		context.close();
		
	}

}
