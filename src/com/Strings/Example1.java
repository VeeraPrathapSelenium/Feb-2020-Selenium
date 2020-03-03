package com.Strings;

public class Example1 {

	public static void main(String[] args) {
		
		
		String str="AB65BC5GFOP10";
		
		str=str.replaceAll("[^0-9]", "@");
		int sum=0;
	
		
		String[] arr=str.split("@");
		
		for (String string : arr) {
			
			if(!string.isEmpty())
			{
				
				
				sum=sum+Integer.valueOf(string);
			}
			
		}
		
		System.out.println(sum);
		
	}

}
