package com.vm.project.java.caffeteria;

public class Espresso  implements VendingMachine{

	public String make(int q)
	{
		double price= 100.00;
		String item="Espresso";
		return item+","+String.valueOf(q*price)+","+q;
		
	}
}
