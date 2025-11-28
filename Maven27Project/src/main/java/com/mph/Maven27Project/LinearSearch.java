package com.mph.Maven27Project;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,23,45,12,65,87,44,9,98};
		System.out.println("Enter the target");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Element found at index ");
				break;
			}
				
			if(i==arr.length)
				System.out.println("Element not found");	
		}
		
		
	}

}
