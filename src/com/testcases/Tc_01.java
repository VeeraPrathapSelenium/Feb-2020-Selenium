package com.testcases;

import com.inheritance.GenericMethods;

public class Tc_01 extends GenericMethods{
	
	
	public void validate_Tc_01()
	{
	launchBrowser("chrome", "https://www.amazon.in/");
	sendData("User Name", "user01");
	sendData("Password", "pass1234");
	clickElement("Login");
	}

	

}
