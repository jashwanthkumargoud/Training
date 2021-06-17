package com.vm.java.training.bank;

@SuppressWarnings("serial")
public class BalanceIsLow extends Exception {
	
	String msg;
	public	BalanceIsLow(String msg){
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}

}
