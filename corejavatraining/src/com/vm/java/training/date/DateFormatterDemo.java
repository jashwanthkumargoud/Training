package com.vm.java.training.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("today" + today);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy MMM dd E W M w");
		
		String afterFormat = today.format(dtf);
		System.out.println("date after format" +afterFormat);

		DateTimeFormatter dtlong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dtfull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dtmedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dtshort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String fulldate= today.format(dtlong);
		System.out.println("full date" +fulldate);
		String mediumdate= today.format(dtmedium);
		System.out.println("medium date" +mediumdate);
		String shortdate= today.format(dtshort);
		System.out.println("medium date" +shortdate);
		

	}

}
