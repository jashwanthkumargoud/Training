package com.vm.training.java.exception;

@SuppressWarnings("serial")
public class ProductDidnotReceived extends Exception{
	
	String msg;
	ProductDidnotReceived(String msg){
		this.msg = msg;
		
	}
	public String toString() {
		return msg;
		
	}

}
