package com.spring.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoWireJavaMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AutoWireJavaMainJavaConfig.class);
		
		Player player = ctx.getBean(Player.class);
		
		System.out.println(player.getTouranment());
		
		((AnnotationConfigApplicationContext)ctx).close();
	}
}
