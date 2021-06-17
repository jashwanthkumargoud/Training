package com.vm.java.training.bank;

public interface Bank {
	public void MaintainingMinBalance(double amount);
	public void MsgOnCharge(double charges);
	public void OnHold(double balance);

}
