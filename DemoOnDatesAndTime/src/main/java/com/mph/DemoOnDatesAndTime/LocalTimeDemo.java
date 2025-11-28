package com.mph.DemoOnDatesAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime t1=LocalTime.of(22, 30);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(10, 45,30);
		System.out.println(t2);
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		LocalTime t3=LocalTime.of(8, 45,34);
		LocalTime t4=LocalTime.of(18, 45,34);
		System.out.println(t3.isBefore(t4));
		
		//converting string to localtime
		String strTime="11:35:20";
		LocalTime convertedTime=LocalTime.parse(strTime);
		System.out.println(convertedTime);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(df);
		System.out.println(formattedTime);
		
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);

	}

}
