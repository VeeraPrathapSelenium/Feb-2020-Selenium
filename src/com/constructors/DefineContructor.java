package com.constructors;

public class DefineContructor {
	
int a=10;
int b=50;
	public DefineContructor()
	{
		
		
		System.out.println("iam a non parameterized constructor");
	}
	
	public DefineContructor(int a)
	{
		this.a=a;
		System.out.println("The constructor value is :"+a);
		System.out.println("I am a class level variable :"+this.a);
	}
	
	public DefineContructor(int a,int b)
	{
		System.out.println("iam a two argument based constructor");
	}
	

}
