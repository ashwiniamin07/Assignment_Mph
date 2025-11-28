package com.mph.Maven28ProjectThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefExecutedService extends Thread{
	private String order;
	public ChefExecutedService(String order) {
		this.order=order;
	}
	public void run() {
		
			System.out.println(getName()+" is preaparing "+order);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				System.out.println(getName()+" got interrupted");
			}
			System.out.println(getName()+" served "+order);
		}

	public static void main(String[] args) {
		ExecutorService manager=Executors.newFixedThreadPool(4);
		String[] menu= {"biriyani","chicken 65","fish curry","panneer fry","fried rice"};
		for(String item:menu)
		{
			ChefExecutedService chefThread=new ChefExecutedService(item);
			manager.submit(chefThread);
		}
		manager.shutdown();

	}

}
