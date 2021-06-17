package com.vm.training.java.string;

public class ConvertCharacters {

	public static void main(String[] args) {
		
		char ch[] = {'J','A','S','H','W','A','N','T','H'};
		//String chStr = String.copyValueOf(ch);
		System.out.println(ch);
		
		String subStr = String.copyValueOf(ch,3,5);
		System.out.println(subStr);
		
		

	}

}
