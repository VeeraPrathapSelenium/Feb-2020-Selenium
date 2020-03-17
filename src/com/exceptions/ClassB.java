package com.exceptions;

public class ClassB{

	public static void main(String[] args) {
		
		try
		{
		ClassA.div();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("My Testing is completed");

	}

}
