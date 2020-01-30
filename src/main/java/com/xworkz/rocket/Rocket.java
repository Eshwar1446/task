package com.xworkz.rocket;

public class Rocket {

	private Fuel  fu;
	private Satellite sat;
	private String countryName;
	
	public Rocket(Fuel fu) {
		this.fu=fu;
		System.out.println("created\t"+fu);
	}
	public void setSat(Satellite sat) {
		this.sat = sat;
		System.out.println("created\t"+sat);
	}
	public void setCountryName(String countryName){
		this.countryName=countryName;
		System.out.println("created\t"+countryName);
	}
	public void start() {
		this.fu.fire();
	}
	public void launch() {
		this.sat.launch(23);
	}
}
