package com.vm.training.java.Assignments;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class DoWhile //Display Numbers between a range Input the number: 10 20
{
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to start series  ");
		int i = sc.nextInt();
		System.out.print("Enter the number to end series  ");
		int n = sc.nextInt();
		do
		{
			System.out.print(i+ " ");
			i++;
		}
		while(i<=n);
		{
		}
	}
}