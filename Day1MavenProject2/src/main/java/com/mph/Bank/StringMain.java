package com.mph.Bank;

public class StringMain {

	public static void main(String[] args) {
		String s2=new String("hello");
		System.out.println(s2.length());
		System.out.println(s2.indexOf('l'));
		String s3="Mphasis";
		String s4=s2.concat(s3);
		System.out.println(s2);
		System.out.println(s4);
		String s="HelloWorld";
		System.out.println(s.substring(5,9));

	}

}
