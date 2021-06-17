package com.vm.java.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner("System.in");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		System.out.println("ENTER THE START DATE ");
		System.out.println("date foramt should be like yyyy-mm-dd");
		String startdate = sc.next();
		
		//LocalDate ld = LocalDate.parse(startdate,dtf1);
		

		LocalDate today = LocalDate.now();
		
		
		LocalDate bkdate = LocalDate.parse(startdate);
		if(bkdate.isAfter(today)) {
			System.out.println("ticket booked successfully" +startdate);
		}
		else {
			System.out.println("ticket will be not booked for previous dates");
			
		}
		
		
		

	}

}
