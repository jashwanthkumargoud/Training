package com.vm.java.training.exam;

public class SavingsAccount {
	
	public class SavingAccount implements BankTest {
		private int bal;
		private double rateOfIntrest;
		public SavingAccount(int balance, double rateOfIntrest) {
			super();
			this.bal = bal;
			this.rateOfIntrest = rateOfIntrest;
		}
		public int getBalance() {
			return bal;
		}
		public void setBalance(int bal) {
			this.bal = bal;
		}
		public double getRateOfIntrest() {
			return rateOfIntrest;
		}
		public void setRateOfIntrest(double rateOfIntrest) {
			this.rateOfIntrest = rateOfIntrest;
		}
		
		public int withdrawl(int amt)
		{
			if(amt>bal)
			{
				System.out.println(" You can not withdraw cash entered amount is high than balance ");
			}
			else
			{
				bal=bal-amt;
			}
			return bal;
		}
		public int deposit(int amt)
		{
				bal=bal+amt;
				return bal;
		}
		

	}

}
