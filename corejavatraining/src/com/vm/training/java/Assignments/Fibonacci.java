package com.vm.training.java.Assignments;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Fibonacci {

	public static void main(String[] args) {
		
		int n1 = 0 ;
		int n2 = 1 ;
		int i ;
		int n3 ;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fibo number ");
		int c = sc.nextInt();
		
		System.out.print( n1+ " " +n2);
		
		for(i=2;i<c;i++) {
		n3 = n1 + n2 ;
		System.out.print(" "+n3);
		n1 = n2; 
		n2 = n3;
		}
		
		

	}

}
