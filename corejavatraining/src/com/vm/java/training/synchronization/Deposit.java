package com.vm.java.training.synchronization;

public class Deposits {
	synchronized public void with(int amt) {
		System.out.println("amount deposited" +amt);
	}

}

class Withdraw implements Runnable{
	Deposit d = new Deposit();
	
	public void run() {
		d.with(500);
	}
}
 public class Deposit{
	 public static void main(String[] args) {
		
		 
	}
 }