package com.mph.BankingApp;

public class SavingAccount extends Account{

	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankname, String iFSC, String branchName,
			double balance) {
		super(accNo, accHolderName, bankname, iFSC, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void withDraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Withdrawal Successful");
		} else {
			System.err.println("Insufficient balance!");
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

	public double checkBalance() {
		return this.balance;
	}

	public void changePin(int newPin) {
		System.out.println("PIN Successfully Changed.");
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", AccNo=" + getAccNo() + ", Holder=" + getAccHolderName()
				+ ", Bank=" + getBankname() + ", IFSC=" + getiFSC() + ", Branch=" + getBranchName() + ", Pin="
				+ getPin() + "]";
	}

}
