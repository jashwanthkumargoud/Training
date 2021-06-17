package com.vm.training.java.Assignments;
import java.util.*;
public class Cube {

	public static void main(String[] args) {
		
		System.out.print("Input number of terms : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0 ; 
		int i ;
		
		for(i = 1 ; i <= num ; i++ )
		{
			
			n = i * i * i ;
			System.out.println(i+ " and cube of "  +i+  " is : " +n);
		}
	}

}
