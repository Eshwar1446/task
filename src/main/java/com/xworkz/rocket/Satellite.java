package com.xworkz.rocket;

public class Satellite {

	private int price;
	private String name;
	
	public Satellite() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void launch(int time) {
		System.out.println("invoked\t"+time);
	}
}
