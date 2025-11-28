package com.mph.thNovDSA;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {3,1,5,7,2,9,8};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int n:a)
			System.out.println(n);

	}

}
