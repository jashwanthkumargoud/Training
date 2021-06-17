package com.vm.java.training.exam;

import java.util.Scanner;

public class BankTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankTest1 hdfcacc = new SavingsAccount(10000, 3.5);
		System.out.println("Balance: "+hdfcacc.deposit(5000));
		
		System.out.println("Balance: "+hdfcacc.withdrawl(100000));
		System.out.println("Balance: "+hdfcacc.deposit(2000));
		System.out.println("Balance: "+hdfcacc.withdrawl(1001));
		System.out.println("Balance: "+hdfcacc.deposit(4000));
	
	
	}
}
