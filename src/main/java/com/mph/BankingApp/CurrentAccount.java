package com.mph.BankingApp;

public class CurrentAccount extends Account{

	private double balance;
	private double overdraftLimit;

	public CurrentAccount(long accNo, String accHolderName, String bankname, String iFSC, String branchName,
			double balance, double overdraftLimit) {
		super(accNo, accHolderName, bankname, iFSC, branchName);
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	public double getBalance() {
		return balance;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public void withDraw(double amount) {
		if (amount <= balance + overdraftLimit) {
			balance -= amount;
			System.out.println("Withdrawal Successful (Overdraft allowed)");
		} else {
			System.err.println("Exceeds Overdraft Limit!");
		}
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount Deposited!");
	}

	public void checkDetails() {
		System.out.println(this.toString());
	}

	public double checkOverDraftLimit() {
		return overdraftLimit;
	}

	public void changePin(int newPin) {
		System.out.println("PIN Updated Successfully!");
	}

	@Override
	public String toString() {
		return "CurrentAccount [balance=" + balance + ", overdraftLimit=" + overdraftLimit + 
				", AccNo=" + getAccNo() + ", Holder=" + getAccHolderName() +
				", Bank=" + getBankname() + ", IFSC=" + getiFSC() + ", Branch=" + getBranchName() + 
				", Pin=" + getPin() + "]";
	}

}
