package com.debugging;

public class DebuggingProcess {

	public static void main(String[] args) {
		
int a=56;
int b=2000;

int value=add(a,  b);
printAccountNumber("ABC",value,"IND");
		
		
		
		
	}
	
	
	public static int add(int a, int b) {
		int result=(a+b)*500;
		
		System.out.println("Additing two numbers");
		
		return result;
	}
	
	public static  void printAccountNumber(String code, int value, String tranid)
	{
		String accountNumber=code+value+tranid;
		System.out.println(accountNumber);
		
	}

}
