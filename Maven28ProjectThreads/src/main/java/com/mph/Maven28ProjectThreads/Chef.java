package com.mph.Maven28ProjectThreads;

public class Chef extends Thread {
	private final String[] orders;
	public Chef(String... orders) {
		this.orders=orders;
	}
	public void run() {
		for(String item:orders) {
			System.out.println(getName()+" is preaparing "+item);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				System.out.println(getName()+" got interrupted");
			}
			System.out.println(getName()+" served "+item);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Chef c1=new Chef("biriyani","chicken curry");
		Chef c2=new Chef("fried rice","fish curry");
		Chef c3=new Chef("mutton","rice");
		Chef c4=new Chef("biriyani","chicken curry","curd rice");
		
		c1.setName("chef-1");
		c2.setName("chef-2");
		c3.setName("chef-3");
		c4.setName("chef-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
	}

}
