package com.mph.Maven27Project;

public class StackUsingArray {
	private static int[] nums=new int[10];
	private static int top=-1;
	
	public static boolean isEmpty() {
		return top==-1;
	}
	public static boolean isFull() {
		return top==10;
	}
	public static void push(int ele) {
		if(isFull())
			System.out.println("stack overflow");
		else
			nums[++top]=ele;
	}
	public static void pop() {
		if(isEmpty())
			System.out.println("Stack underflow");
		else
			System.out.println(nums[top--]);
	}
	public static void display() {
		for(int i:nums)
			System.out.println(i);
	}
	public static void peek() {
		System.out.println(nums[top]);
	}
		public static void main(String[] args) {
		pop();
		push(10);
		push(20);
		display();
		peek();

	}

}
