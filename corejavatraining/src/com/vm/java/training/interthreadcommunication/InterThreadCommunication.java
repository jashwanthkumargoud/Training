package com.vm.java.training.interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		Customer itc = new Customer();
		
		
		Thread t1 = new Thread();
		{
			public void run() {
				System.out.println(itc.withdraw());
			}
		}
		

	}

}
