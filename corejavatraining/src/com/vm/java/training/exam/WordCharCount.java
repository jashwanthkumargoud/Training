package com.vm.java.training.exam;

import java.util.Scanner;

public class WordCharCount {
	   public static void main(String args[]) {
	      int flag = 0;
	      int words = 0;
	      int i = 0;
	      int count=0;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("enter the string");
	      String str = sc.nextLine();
	      
	      while (i < str.length()) {
		         if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
		            flag = 0;
		         }else if (flag == 0) {
		            flag = 1;
		            words++;
		         }
		         i++;
		      }
	      
	      for(i = 0; i < str.length(); i++) 
	      {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	      
	      
	      System.out.println("The entered string is: " + str);
	      System.out.println("Number of Characters: " +count);
	      System.out.println("Words count in the give String: " +words);
	   }
	}