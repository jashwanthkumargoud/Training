package com.vm.training.java.exception;

public class LowBalanceExceptionTest {

	public static void main(String[] args) {
		
		int balance = 900;
		try {
			if(balance<1000) {
				throw new LowBalanceException("your balance is " +balance);
				
			}
		}
		catch(LowBalanceException e) {
			e.printStackTrace();
			
		}

	}

}
