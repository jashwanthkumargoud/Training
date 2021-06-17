package com.vm.training.java.Assignments;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //creating object for scanner class
		
		System.out.println("Enter the 1st number"); //prints message to enter 1st number
		
		int num1 = sc.nextInt(); //It will scan the entered 1st number
		
		System.out.println("Enter the 2nd number");  //prints message to enter 2nd number
		
		int num2 = sc.nextInt(); //It will scan the entered 2nd number
		
		System.out.println("Enter the 3rd number");  //prints message to enter 3rd number
		
		int num3 = sc.nextInt(); //It will scan the entered 3rd number
		
		if( num1 > num2 && num1 >num3 )  //it will compare numbers
		{
			
			System.out.println("The greatest" +num1); //it will print the number
			
		}
		
		else if( num2 > num3 && num2 > num1) //it will compare numbers
		{
			
			System.out.println("The greatest" +num2); //it will print the number
			
		}
		
		else if( num3 > num1 && num3 > num2 ) //it will compare numbers
		{
			
			System.out.println("The greatest:" +num3); //it will print the number
			
		}
		
		
		

	}

}
