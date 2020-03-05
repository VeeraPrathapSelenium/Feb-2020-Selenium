package com.stringsexamples;

public class PrintSentance {

	public static void main(String[] args) {
		String str="The Voucher Number : 1089 The Transaction Number : 7415 The Journal ID : 7412";
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(!(i==str.length()-1))
			{
				
				if(Character.isDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i+1))){
					temp=temp+str.charAt(i)+"@";
				}else
				{
					temp=temp+str.charAt(i);
				}
				
				
				
				
			}else
			{
				temp=temp+str.charAt(i);
			}
			
			
			
			
		}
		
		
	String[] arr=temp.split("@");
	for (String string : arr) {
		System.out.println(string.trim());
	}
	
	}

}
