package com.vm.training.java.Assignments;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //creating object for scanner class
		
		System.out.println("Enter the number to show weekday"); //prints message to enter the week number
		
		int w1 = sc.nextInt(); //It will scan the entered 1st number
		
		switch(w1) //it will take the integer and executes the switch case
		{
		case 1:
			System.out.println("Monday");
			break;//to terminate a statement sequence
			
		case 2:
			System.out.println("Tuesday");
			break; //to terminate a statement sequence
			
		case 3:
			System.out.println("Wednesday");
			break; //to terminate a statement sequence
			
		case 4:
			System.out.println("Thursday");
			break; //to terminate a statement sequence
			
		case 5:
			System.out.println("Friday");
			break; //to terminate a statement sequence
			
		case 6:
			System.out.println("Saturday");
			break; //to terminate a statement sequence
			
		case 7:
			System.out.println("Sunday");
			break; //to terminate a statement sequence
			
			default:
			
				System.out.println("entered number should be from 1 to 7");
				//it will print above message
		}
		
		
		

	}

}
