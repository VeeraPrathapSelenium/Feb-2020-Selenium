package com.inheritance;

public class GenericMethods {
	
	public void launchBrowser(String browser,String url)
	{
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Opening chrome browser..!!!");
			break;
		case "ff":
			System.out.println("Opening FireFox browser..!!!");
			break;

		default:
			break;
		}
	}
	
	
	public void verifyElementExist(){
		
	}
	
	public void sendData(String webElement,String Data){
		System.out.println("Entering data "+Data+" into the webelement "+webElement);
	}
	
	public void selectDropDown(){
		
	}
	
	public void clickElement(String WebElement){
		System.out.println("Clicking on the webelement "+WebElement);
	}
	
	public void waitForElement(){
		
	}
	
	public void takeScreenShot(){
		
	}
	
	public void getDropDownOptions(){
		
	}
	
	

}
