package com.exceptions;

public class AgeException extends RuntimeException{
	
	String message=null;
	
	AgeException(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return "AgeException [message=" + message + "]";
	}
	
	
	
	

}
