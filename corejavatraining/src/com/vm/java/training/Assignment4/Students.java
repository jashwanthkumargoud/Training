package com.vm.java.training.Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("enter how many  rows to enter");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("enter the id no");
			int idd10 = sc.nextInt();
			System.out.println("enter the marks");
			int marks10 = sc.nextInt();
			al.add(idd10,marks10);
			System.out.println(al);
		}
		
		/*
		 * System.out.println("enter the  1st  student id "); int idd1 = sc.nextInt();
		 * 
		 * System.out.println("Enter the first student name"); String name1 =
		 * sc.nextLine();
		 * 
		 * System.out.println("enter the first student marks "); int marks1 =
		 * sc.nextInt();
		 * 
		 * al.add(idd1,marks1);
		 * 
		 * System.out.println("enter the  2nd  student id "); int idd2 = sc.nextInt();
		 * 
		 * System.out.println("enter the 2nd student marks "); int marks2 =
		 * sc.nextInt();
		 * 
		 * al.add(idd2,marks2);
		 * 
		 * System.out.println("enter the  2nd  student id "); int idd3 = sc.nextInt();
		 * 
		 * System.out.println("enter the 2nd student marks "); int marks3 =
		 * sc.nextInt();
		 * 
		 * al.add(idd3,marks3);
		 * 
		 */

	}

}
