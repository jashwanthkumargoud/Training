package com.vm.java.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParse {

	public static void main(String[] args) {
		
		
		String startDate = "2021-05-25";
		
		LocalDate ld = LocalDate.parse(startDate);
		System.out.println(ld);
		
		String bookingDate = "2021/May/25";
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
		LocalDate bkdate = LocalDate.parse(bookingDate, dft1);
		System.out.println("booking date" +bkdate);
		
		
		

	}

}
