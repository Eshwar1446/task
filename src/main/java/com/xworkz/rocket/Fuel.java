package com.xworkz.rocket;

public class Fuel {

	private int liters;
	
	public Fuel(int liters) {
		this.liters=liters;
		System.out.println("created\t"+liters);
	}
	public void fire() {
		System.out.println("invoked fire");
	}
}
