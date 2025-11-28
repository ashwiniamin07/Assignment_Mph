package com.mph.Bank;

import com.mph.Bank.SavingAccount;

public class BankingApp {

	public static void main(String[] args) throws InsuffientFundException {
		SavingAccount sa=new SavingAccount(34567821, "Swapna Motupally", "ICIC", "ICIC09786", "Habsiguda", 10000);
		System.out.println(sa);
		
		sa.deposit(5000);
		sa.withDraw(14000);
		System.out.println(sa.checkbalance());
		
		
	}

}
