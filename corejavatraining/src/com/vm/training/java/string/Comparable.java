package com.vm.training.java.string;

public class Comparable {

	public static void main(String[] args) {
		
		String x = "JUNK";
		String y = "junk";
		
		if(x.equals(y)) {
			System.out.println("Both Strings are Equal");
			
		}
		else {
			System.out.println("Both Strings are not Equal");
		}
		
		if(x.equalsIgnoreCase(y)) {
			System.out.println("both strings are equal");
		}
		else {
			System.out.println("Both Strings are not equal");
		}
	}

}
