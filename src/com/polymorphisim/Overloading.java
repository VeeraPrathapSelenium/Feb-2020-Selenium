package com.polymorphisim;

public class Overloading {
	
	public void add()
	{
		System.out.println("Addition of two numbers....!!!");
	}
	
	protected int add(int a, int b)
	{
		System.out.println("Addition of two numbers with paramters!!!");
		
		return a+b;
	}

	
	private String add(int a, int b,int c)
	{
		System.out.println("Addition of three numbers with paramters!!!");
		
		return String.valueOf((a+b+c));
	}
	
}
