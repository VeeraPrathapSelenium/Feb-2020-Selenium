package com.exceptions;

public class ClassA {
	
	
	public static void div(){
		
		try{
		
		System.out.println(10/0);
		}catch(NullPointerException e)
		{
			System.out.println("from Class A Catch Block");
		}
	}

}
