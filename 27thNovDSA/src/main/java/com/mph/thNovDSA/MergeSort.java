package com.mph.thNovDSA;

public class MergeSort {
	public static void mergeSort(int arr[],int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
public static void merge(int arr[],int left,int mid,int right) {
	int ll=mid-left+1;
	int rl=right-mid;
	int larr[]=new int[ll];
	int rarr[]=new int[rl];
	
	for(int i=0;i<ll;i++) {
		larr[i]=arr[left+i];
	}
	for(int i=0;i<rl;i++) {
		rarr[i]=arr[mid+1+i];
	}
	int i=0,j=0;
	int k=left;
	while(i<ll & j<rl) {
		if(larr[i]<=rarr[j])
			arr[k++]=larr[i++];
		else
			arr[k++]=rarr[j++];
	}
	while(i<ll)
		arr[k++]=larr[i++];
	while(j<rl)
		arr[k++]=rarr[j++];
}
	public static void main(String[] args) {
		int arr[]={3,1,5,7,2,9,8,10,23,4};
		mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
