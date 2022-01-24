package com.spring.example.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoWireJavaMainJavaConfig {

	private Player player;
	private Touranment touranment;
	
	
	@Bean
	public Player getPlayer() {
		player = new Player();
		return player;
	}
	
	@Bean
	public Touranment getTouranment() {
		touranment = new Touranment();
		return touranment;
	}
	
}
