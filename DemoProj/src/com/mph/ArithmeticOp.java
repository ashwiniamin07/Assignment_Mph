package com.mph;

public class ArithmeticOp {

	public static void main(String[] args) {
//		int a=57;
//		int b=2;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println((float)a/b);
//		System.out.println(a%b);
//		int c=++a;
//		System.out.println(c);
		int i=5;
		int j=4;
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(i^j);
		System.out.println(i<<1);
		System.out.println(i>>1);
		System.out.println(~i);
		
		int a=2;
		int b=5;
		int c=3;
		
		System.out.println(a>b && a>c?a:(b>a&& b>c?b:c));

	}

}
