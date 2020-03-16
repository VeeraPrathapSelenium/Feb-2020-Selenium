package com.singleton;

public class SingleTonClass {
	
	private static SingleTonClass obj;
	//private static String s;
	
	
	private SingleTonClass(){
	System.out.println("Creating a class object");	
	}
	
	public static SingleTonClass getInstance(){
		
		if(obj==null)
			{
			obj=new SingleTonClass();
			}
		return obj;
	}
	
	

}
