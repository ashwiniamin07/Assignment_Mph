package com.mph.Bank;

public class Calculator implements ScientificCalc {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(float a, float b) {
		System.out.println(a+b);
	}
	public void add(String s1, String s2) {
		System.out.println(s1+s2);
	}
	public void add(long l,double d) {
		System.out.println(l+d);
	}
	@Override
	public double power(double m, double n) {
		
		return Math.pow(m, n);
	}
	@Override
	public double squareRoot(double m) {
		
		return Math.sqrt(m);
	}
	@Override
	public double logValue(double m) {

		return Math.log(m);
	}

	public static void main(String[] args) {
		Calculator cal1=new Calculator();
		cal1.add(5, 10);
		cal1.squareRoot(25);
		cal1.power(2, 2);

	

}

	}
