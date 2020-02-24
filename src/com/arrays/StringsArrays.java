package com.arrays;

public class StringsArrays {

	public static void main(String[] args) {

String[] empnames=new String[3];

empnames[0]="Prathap";
empnames[1]="Krish";

System.out.println(empnames[10]);
		
//uisng fo loop

for(int i=0;i<=empnames.length-1;i++)
{
	System.out.println(empnames[i]);
}

System.out.println("*******************************************************");

for (String empname : empnames) {
	System.out.println(empname);
}

	}

}
