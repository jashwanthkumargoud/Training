package com.vm.training.java.Assignments;

import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class PositiveNegative {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		
		if(a < 0) {
			
			System.out.println("Entered number is negative");
		}
		
		else {
			System.out.println("Entered number is positive");
		}
		
		

	}

}
