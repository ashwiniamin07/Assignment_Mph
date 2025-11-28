package com.mph.Maven28ProjectThreads;

public class MyThread extends Thread{
	public void run() {
		System.out.println("thread "+this.getName()+" running");
		for(int i=1;i<=5;i++) {
			System.out.println(this.getName()+" value :"+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();

	}

}
