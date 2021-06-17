package com.vm.training.java.Assignments;
import java.io.*;
import java.util.*;


@SuppressWarnings("unused")
public class Loops {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number to be in loop ");
		 int a = sc.nextInt();
		 int sum = 0;
		 double avg = 0;
		 for(int i=1 ; i <= a ; i++ )
		 {
			 System.out.println(i);
			 sum = sum + i;
			 avg = sum/a;
			 System.out.println("sum of numbers = " +sum);
			 System.out.println(" \n ");
			 System.out.println("Average = " +avg);
		 }
	}

}
