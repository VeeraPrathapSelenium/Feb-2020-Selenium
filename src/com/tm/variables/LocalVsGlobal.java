package com.tm.variables;

public class LocalVsGlobal {
	
	//Global variables
	static String username;
	
	int age;
	
	
	

	public static void main(String[] args) {
		
		LocalVsGlobal obj=new LocalVsGlobal();
		
		
		username="Prathap";
		obj.age=45;
		obj.testInstance() ;
		LocalVsGlobal.testStatic();

	}
	
	public void testInstance() {
		System.out.println("From Instance "+username);
		System.out.println("From instance "+age);
	}
	
	public static void testStatic() {
		LocalVsGlobal obj=new LocalVsGlobal();	
		System.out.println("From Static "+username);
		System.out.println("From Static "+obj.age);
	}
	
	
	
	
	
	

}
