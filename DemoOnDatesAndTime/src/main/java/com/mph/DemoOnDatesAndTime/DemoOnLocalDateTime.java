package com.mph.DemoOnDatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println(dt.getYear());
		System.out.println(dt.getMonth());
		System.out.println(dt.getDayOfWeek());
		System.out.println(dt.getDayOfMonth());
		
		LocalDateTime newdate=LocalDateTime.of(2025, 6,23,22,43);
		System.out.println(newdate);
		
		//string in the format yyyy-MM-dd hh:mm:ss a
		//given timeDate is 2024-11-22 15:45:40 a;
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime lt=LocalDateTime.of(2024, 11,22,15,45,40);
//		String str=df.format(lt);
//		System.out.println(str);
		
		String str1="2024-11-23 15:45:40";
		LocalDateTime parsedDateTime=LocalDateTime.parse(str1,df);
		System.out.println(parsedDateTime);
	}

}
