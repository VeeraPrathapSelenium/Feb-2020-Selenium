package com.strings;

public class String_charAt {

	public static void main(String[] args) {

String str="india";

System.out.println(str.charAt(1));
		
//
//for(int i=0;i<str.length();i++)
//{
//	System.out.println(str.charAt(i));
//}

char[] charcters=str.toCharArray();

for (char charc : charcters) {
	System.out.println(charc);
}
	
		

	}

}
