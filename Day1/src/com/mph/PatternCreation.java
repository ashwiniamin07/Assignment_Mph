package com.mph;

public class PatternCreation {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=40-i;k++) {
			System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
