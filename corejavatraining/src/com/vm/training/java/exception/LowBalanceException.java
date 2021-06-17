package com.vm.training.java.exception;

public class LowBalanceException extends Exception{
	
	String msg;
	LowBalanceException(String msg){
		this.msg = msg;
		
	}
	public String toString() {
		return msg;
		
	}

}
