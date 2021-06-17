package com.vm.training.java.string;

public class StringObjectCreation {

	public static void main(String[] args) {
		
		String s1 = new String(" Value Momentum ");
		String s4 = new String(" Value Momentum ");
		String s2 = " Value Momentum ";
		String s3 = " Value Momentum ";
		 System.out.println(s1 == s4);
		 System.out.println(s1.equals(s2));
		 
		 
		 s1 = s1.concat(" Jashwanth ");
		 
		 System.out.println(s1);
		 System.out.println(s1.length());
		 
		 System.out.println(s1.toLowerCase());
		 System.out.println(s1.toUpperCase());
		 System.out.println(s1.charAt(20));
		 System.out.println(s1.compareTo(s2));
		 System.out.println(s1.intern());
		 System.out.println(s1.trim());
		 System.out.println(s1.indexOf(2,5));
		 System.out.println(s1.substring(3));
	}

}
