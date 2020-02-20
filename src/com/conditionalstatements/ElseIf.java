package com.conditionalstatements;

public class ElseIf {

	public static void main(String[] args) {

int a=50;
int b=300;

//first check if a is greater than b

if (a>b) {
	System.out.println("A is greater than B");
}//if above condition fails check if the a value is in the range of 20 and 60
else if (a>=20 && a<=60) {
	
	System.out.println(" A is not greater than B, but it ranges in between 20 and 60");
}
else {
	
	System.out.println("A is not greater than B , also not in the range of 20 and 60");
}


		
		
		
		

	}

}
