package com.stringsexamples;

public class PrintThePatterns {

	public static void main(String[] args) {

String str="3a4b5c7";

char[] arr=str.toCharArray();
String temp="";
String ignored="";
for(int i=0;i<arr.length;i++)
{
	if(!(i==arr.length-1))
	{
	if(Character.isDigit(arr[i]) && Character.isLetter(arr[i+1]))
	{
		
		String num=String.valueOf(arr[i]);
		
		
		
		printPattern(Integer.valueOf(num),arr[i+1]);
		
				
	}
	}else
	{
		ignored=arr[i]+"--->> Ignored";
	}
	System.out.println(ignored);
}




		

	}

	public static void printPattern(int num,char c)
	{
		String temp="";
		for(int i=1;i<=num;i++)
		{
			temp=temp+c;
		}
		System.out.println(temp);
	}
	
	
	
}
