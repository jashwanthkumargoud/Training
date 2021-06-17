package com.vm.java.training.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		
		LocalDate todaydate = LocalDate.now();
		System.out.println(" date " +todaydate);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(" local date and time " +ldt);
		
		System.out.println(" day of the year " +todaydate.getDayOfYear());
		System.out.println(" day of the week " +todaydate.getDayOfWeek());
		System.out.println(" month of day " +todaydate.getDayOfMonth());
		
		
		
		System.out.println("today" +todaydate);
		System.out.println("next day "+ todaydate.plusDays(1));
		System.out.println("" +todaydate.plusWeeks(2));
		System.out.println("" +todaydate.plusMonths(1));
		
		
		
		LocalDate bd = LocalDate.of(2021, 05, 30);
		

	}

}
