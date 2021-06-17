package com.vm.java.training.bank;

@SuppressWarnings("serial")
public class MaintainingMinimumBalanceException extends Exception{
	
		String msg;
		public	MaintainingMinimumBalanceException(String msg){
			this.msg=msg;
		}
		public String toString() {
			return msg;
		}
}