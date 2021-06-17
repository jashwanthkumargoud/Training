package com.vm.java.training.exam;

public class MinimumCharacterException extends Exception {
	  
	private static final long serialVersionUID = 1L;
	String msg;
	MinimumCharacterException(String msg)
	{
		this.msg=msg;
	}
	
	public String toString() { 
		return msg;
	}
}