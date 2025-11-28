package com.mph;

import java.util.Scanner;

public class PatternMatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mobileNum=sc.next();
		if(mobileNum.matches("[6-9]\\d{9}"))
			System.out.println("Valid mobile number");
		else
			System.out.println("Invalid Mobile number");
				

	}

}
