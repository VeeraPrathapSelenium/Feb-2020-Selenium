package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestWithMultiple {

	public static void main(String[] args) {
	
		try{
			File f=new File("abc.txt");
			FileReader fr=new FileReader(f);
			
		}
		catch(Exception e)
		{
			System.out.println("From Generalized");
		}
		
		
		

	}

}
