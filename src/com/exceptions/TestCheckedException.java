package com.exceptions;

public class TestCheckedException {

	public static void main(String[] args) {


		int aAge=50;
		
		int bAge=30;
		
		if (aAge>=bAge){
			throw new AgeException("A age canot be graeter than B age");
		}
		
		
		
		

	}

}
