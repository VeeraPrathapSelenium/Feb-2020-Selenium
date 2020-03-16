package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		
		try{
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Excecution completed");
		}
		

	}

}
