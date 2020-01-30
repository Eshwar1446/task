package com.xworkz.rocket.threads;

public class ThreadImpl extends Thread{


	public void run() {
			
		System.out.println("running");
		
	}
	public void start() {
		System.out.println("invoked start");
		
	}

}
