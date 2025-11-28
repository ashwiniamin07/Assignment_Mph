package com.mph;

public class Swap2Num {

	public static void main(String[] args) {
		int a=5;
		int b=3;
//		 int temp=num1;
//		 num1=num2;
//		 num2=temp;
//		 System.out.println("num1="+num1+" num2="+num2);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
		
		//swapping 3 numbers
		int i=5;
		int j=6;
		int k=7;
		 i=i+j+k;
		 j=i-j-k;
		 k=i-j-k;
		 i=i-j-k;
		 System.out.println("i="+i+" j="+j+" k="+k);

	}

}
