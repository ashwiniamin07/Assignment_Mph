package com.mph.thNovDSA;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int target=6;
		int res=Search(a,target);
		if(res!=-1)
			System.out.println("target found at: "+res);

	}
	static int Search(int a[],int target) {
		int low=0;int high=a.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==target)
				return mid;
			else if(a[mid]<target)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
	

}
