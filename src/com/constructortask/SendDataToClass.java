package com.constructortask;

import java.util.ArrayList;
import java.util.List;

public class SendDataToClass {

	public static void main(String[] args) {
		
		
		List<StudentRegistration> allstudents=new ArrayList<>();
		
		allstudents.add(new StudentRegistration("Prathap",28,"10"));
		
		allstudents.add(new StudentRegistration("Hari",22,"11"));
		
		allstudents.add(new StudentRegistration("Krishna",23,"9"));
		
		for (StudentRegistration student : allstudents) {
			System.out.println(student.getStudentname());
			System.out.println(student.getAge());
		}

	}

}
