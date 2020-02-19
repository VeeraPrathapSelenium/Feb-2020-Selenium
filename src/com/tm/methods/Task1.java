package com.tm.methods;

public class Task1 {
	
    static int rollno=1;	
	

	public static void main(String[] args) {
		Task1 task=new Task1();
		task.addStudent("Hari","Hyderabad",26,"12th");
		task.addStudent("Krish","Banglore",22,"12th");
		task.addStudent("Raj","Chennai",23,"12th");
	}
	
	/*
	method name:addStudent
	description:This method is used to add a student to the application database
	input parameter:String name,String place,int age,String standard
	output parameter:NA
	designer:Prathap
	Reviewd:Yes
	lastmodified:19-Feb-2020
	modified reason:NA
	*/	
	public void addStudent(String name,String place,int age,String standard) {
		//
		System.out.println("Student number("+rollno+")  is created successfully..!!");
		//
		System.out.println("Name : "+name);
		System.out.println("Place : "+place);
		System.out.println("Age : "+age);
		System.out.println("Standard : "+standard);
		rollno=rollno+1;
		System.out.println("**********************************");
	}
	/**
	 * 
	 */

}
