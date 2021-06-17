package com.vm.java.training.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PeriodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the DOB");
		String dob =sc.next();
		LocalDate today =LocalDate.now();
		LocalDate joiningdate = LocalDate.of(2000,4, 8);
		LocalDate bkdate = LocalDate.parse(dob);
		
		Period p = Period.between(today, joiningdate);
		System.out.println(p.getDays()+ " " +p.getMonths()+ " "+p.getDays());

	}

}
