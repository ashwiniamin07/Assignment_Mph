package com.mph.thNovDSA;

public class QuickSort {
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
	}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[low];
		int i=low,j=high;
		while(i<j) {
			while(i<=j && arr[i]<=pivot)i++;
			while(i<=j && arr[i]>pivot)j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}

	public static void main(String[] args) {
		int arr[]={3,1,5,7,2,9,8,10,23,4};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
