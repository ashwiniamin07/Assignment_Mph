package com.mph.DesignPatterns;

public class UpiPayment implements Payment {
	
	private CashPayment cash=new CashPayment();
	@Override
	public void pay(double amount) {
		System.out.println("Upi payment Processing");
		System.out.println("user validated");
		System.out.println("pin verification done");
		System.out.println("payment successfull");
		cash.pay(amount);
	}

}
