package com.Strings;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer bfr=new StringBuffer();
		bfr.append("Hello");
		bfr.append("Python");
		
		System.out.println(bfr);
		bfr.reverse();
		System.out.println(bfr);
		
		

	}

}
