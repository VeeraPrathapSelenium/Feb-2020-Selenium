package com.inheritance;

public class Child1 extends Parent {
	

	public static int bikes=5;	
	public int cars=3;
	
	public void runSuperMarket(){
		System.out.println("Running SuperMarket...");
		System.out.println(this.cars);
		System.out.println(super.cars);
	}

}
