package com.interf;

public interface MyInterface {
	
	public int add();
	public int mul();
	
	public static int test(){
		System.out.println("Do testing for static method in interface");
		return 10;
	}	

	
	default int doTest(){
		return 89;
	}
	
	

}
