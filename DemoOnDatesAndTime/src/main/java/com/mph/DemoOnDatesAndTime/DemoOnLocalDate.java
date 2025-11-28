package com.mph.DemoOnDatesAndTime;

import java.time.LocalDate;
import java.time.Period;

public class DemoOnLocalDate {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
		
		LocalDate mydate=LocalDate.of(2025, 6,23);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is "+today.plusDays(3));
		System.out.println("5 days before today is "+today.minusDays(5));
		
		LocalDate mydate1=LocalDate.of(2023, 5,15);
		LocalDate mydate2=LocalDate.of(2020, 7, 24);
		System.out.println(mydate1.isBefore(mydate2));
		
		//converting string to local date
		String strDate="2024-04-19";
		LocalDate ldate=LocalDate.parse(strDate);
		System.out.println(ldate);
		
		
		today=LocalDate.now();
		LocalDate dob=LocalDate.of(1981, 06,26);
		Period p=Period.between(dob,today);
		//System.out.println(p);
		System.out.println("My age is "+p.getYears()+" years"+p.getMonths()+"months "+p.getDays()+"days");
		
		
		
	}

}
