package com.vm.training.java.Assignments;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();
        
        if((year % 100) != 0 || (year % 100 == 0) && (year % 400 == 0))
        		{
        	if((year % 4) == 0) {
        		
        		System.out.println(year + " is a leap year");
        		
        	}
        	
        	 else 
        	 {
             	System.out.println( year+ "Entered year is not a leap year");
             }
        	
        }
        
       
	}
}
