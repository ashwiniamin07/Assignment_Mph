package com.mph;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float res=0;
		System.out.println("Enter num1");
		int a=sc.nextInt();
		System.out.println("Enter num2");
		int b=sc.nextInt();
		System.out.println("Enter the operand");
		char op=sc.next().charAt(0);
		switch(op)
		{
		case '+':
			res=a+b;
			break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
			break;
		case '/':
			res=(float)a/b;
			break;
		default:
			System.out.println("Enter the valid operand");
		}
		System.out.println("Result="+res);

	}

}
