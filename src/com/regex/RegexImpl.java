package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImpl {

	public static void main(String[] args) {

//String str="My PAN Number is PHGBY8582R is genrated sucessfully";
		
String str="My email id is firstname.lastname@cognizant.com";

//String pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}";

String pattern="[a-z0-9]*\\.[a-z0-9]*\\@cognizant\\.com";

	
		
		

	}

	public static void getPatternData(String str,String pattern) 
	{
		Pattern p=Pattern.compile(pattern);

		Matcher match=p.matcher(str);

		while(match.find())
		{
			System.out.println(match.group());
		}
			
	}
	
	
}
