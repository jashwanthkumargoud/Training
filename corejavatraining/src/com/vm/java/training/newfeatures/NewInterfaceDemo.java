package com.vm.java.training.newfeatures;



interface Bank{
	default void openAccount() {
		System.out.println("open account ");
	}
	
	static void holiday() {
		System.out.println("bank is holiday");
	}
	
	abstract int rateOfIntrest(int intrest);
	
}

class Axis implements Bank {

	@Override
	public int rateOfIntrest(int intrest) {
		// TODO Auto-generated method stub
		return intrest;
	}
	
}

public class NewInterfaceDemo {

	public static void main(String[] args) {
		Bank bank = new Axis();
		bank.openAccount();
		System.out.println("rate of intrest " +bank.rateOfIntrest(4));
		Bank.holiday();

	}

}
