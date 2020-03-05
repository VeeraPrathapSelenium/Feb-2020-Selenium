package com.constructortask;

public class StudentRegistration {
	
	private String studentname;
	private int age;
	private String standard;
	
	public StudentRegistration(String studentname, int age, String standard) {
		
		this.studentname = studentname;
		this.age = age;
		this.standard = standard;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	

}
