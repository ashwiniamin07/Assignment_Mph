package com.mph.Maven25Project;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZonedDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getOffset());
		System.out.println(dateTime.getZone());
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(regionDateTime);
//		Duration diff=Duration.between(dateTime.toInstant(), regionDateTime.toInstant());
//		System.out.println(diff.toHours());
		int diffSeconds=dateTime.getOffset().getTotalSeconds()-regionDateTime.getOffset().getTotalSeconds();
		int hours=diffSeconds/3600;
		int min=(diffSeconds%3600)/60;
		System.out.println("Difference is : "+hours+" hours "+min+" minutes ");
		
		//converting localdate to zoneddatetime
		LocalDateTime dateTime2=LocalDateTime.now();
		ZonedDateTime zonedDateTime=dateTime2.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(zonedDateTime);
		
		//convert Indian time to us time
		ZonedDateTime indiaTime=ZonedDateTime.now();
		ZonedDateTime usaTime=indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(indiaTime);
		System.out.println(usaTime);
		
		//print zoneddatetime in the specific pattern
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a z");
		String formattedZonedateTime=indiaTime.format(df);
		System.out.println(formattedZonedateTime);
		System.out.println(regionDateTime.format(df));
	}

}
