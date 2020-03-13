package com.polymorphisim;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.add();
		
	}
	
	
	public Integer add()
	{
		System.out.println("Doing addition of two numbers");
		return 0;
	}
	
	public void doTest(){
		System.out.println("Doing testing....!!!!!");
	}

}
