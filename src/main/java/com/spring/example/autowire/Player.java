package com.spring.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Player {

	private int id = 100;
	private String name = "VINOD";
	
	@Autowired
	private Touranment touranment;
	
	
	public Touranment getTouranment() {
		return touranment;
	}
	public void setTouranment(Touranment touranment) {
		this.touranment = touranment;
	}
	
}
