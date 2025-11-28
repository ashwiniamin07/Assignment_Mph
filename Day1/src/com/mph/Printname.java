package com.mph;

import java.util.Scanner;

public class Printname {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
			System.out.println("Ashwini");
			System.out.println("do you want to repeat ? y/n");
			choice=sc.next().charAt(0);
		}while(choice!='n');
		System.out.println("thank you!!");
	}

}
