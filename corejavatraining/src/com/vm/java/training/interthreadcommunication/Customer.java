package com.vm.java.training.interthreadcommunication;

public class Customer {
	
	int balance = 5000;
	
	public int withdraw(int amount) {
		
		if (balance < amount) {
			System.out.println("you don't have sufficient balance");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "is going to withdraw");
		balance-=amount;
		
		return amount;
		
	}
	
	synchronized public int deposits(int amount) {
		balance+=amount;
		System.out.println(Thread.currentThread().getName() + "is deposit");
		notifyAll();
		return amount;
		
	}
	
	

}
