package com.mph;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));

	}
	static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0) return false;
		}
		return true;
		}

}
