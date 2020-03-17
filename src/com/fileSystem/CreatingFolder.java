package com.fileSystem;

import java.io.File;
import java.io.IOException;

public class CreatingFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\tm\\Desktop\\Prathap\\abc");
		f.mkdir();
		
		//Runtime.getRuntime().exec("RD /S /Q C:\\Users\\tm\\Desktop\\Prathap\\abc");
		
		File[] arr=f.listFiles();
		
		for (File file : arr) {
			System.out.println(file);
			
			
		}
		
	}

}
