package com.vm.training.java.Assignments;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class PatternRate {

	public static void main(String[] args) {
		
		int i;
		int j,n1;
		System.out.print("Input no of rows: ");
		Scanner sc = new Scanner(System.in);
		 n1 = sc.nextInt();
		for (i=1 ; i <= n1 ; i++) 
		{
			for (j=1 ; j <= i ; j++)
			
				System.out.print(" @ ");
				
				System.out.println("");
				
			
		}

	}

}
