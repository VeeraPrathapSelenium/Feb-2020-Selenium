package com.singleton;

public class TestSingleTon {

	public static void main(String[] args) {
		
		SingleTonClass obj1=SingleTonClass.getInstance();
		
		SingleTonClass obj2=SingleTonClass.getInstance();

		SingleTonClass obj3=SingleTonClass.getInstance();
	}

}
