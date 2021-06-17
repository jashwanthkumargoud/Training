package com.vm.java.training.exam;

public class GST extends IncomeTax{
	
	
	@Override
	int calculateTax(int income) {
		
		int oldTax = super.calculateTax(income);
		int newTax = 5;
		return oldTax+newTax;
	}

	public static void main(String[] args) {
		
		GST gst = new GST();
		System.out.println(gst.calculateTax(100));
		
		

	}

	

}
