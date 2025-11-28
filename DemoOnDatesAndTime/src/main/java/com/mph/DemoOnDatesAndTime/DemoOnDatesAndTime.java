package com.mph.DemoOnDatesAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDatesAndTime {

	public static void main(String[] args) {
		Date currentDate=new Date();
		System.out.println(currentDate);
		long ms=System.currentTimeMillis();
		System.out.println(ms);
		Date currentDateOfMs=new Date(ms);
		System.out.println(currentDateOfMs);
		
		long msl=1234568889;
		Date myDate=new Date(msl);
		System.out.println(myDate);
		
		Date newDate=new Date(2024-1900,07,22);
		System.out.println(newDate);
		
		System.out.println(currentDate.getDate()+3);
		System.out.println(currentDate.getDay());
		System.out.println(currentDate.getYear());
		
		Date date1=new Date(2021,01,24);
		Date date2=new Date(2023,01,24);
		System.out.println(date1.after(date2));
		
		String str="24-11-2025";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf.format(currentDate));
		
//		String str1="24-11-2025";
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		//Date d=sdf1.parse(str);
		//System.out.println(d);
		
		Date dob=new Date(2000-1900,05,20);
		Date today=new Date();
		int ageInYears=today.getYear()-dob.getYear();
		System.out.println(ageInYears+ " Years");
		
		System.out.println(today.toString());
	}

}
