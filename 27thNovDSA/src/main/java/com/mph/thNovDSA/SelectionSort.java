package com.mph.thNovDSA;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,5,7,2,9,8};
		for(int i=0;i<a.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[minIndex]>a[j])
					minIndex=j;
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		for(int n:a)
			System.out.println(n);

	}

}
