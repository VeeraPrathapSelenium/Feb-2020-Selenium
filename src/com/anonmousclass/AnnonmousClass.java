package com.anonmousclass;

public class AnnonmousClass {

	public static void main(String[] args) {


		ClassA a=new ClassA(){
			
			public void add(){
				System.out.println("I am overided method");
			} 
			
		};
		a.add();

	}

}
