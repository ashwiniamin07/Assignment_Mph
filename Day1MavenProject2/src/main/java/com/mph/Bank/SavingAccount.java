package com.mph.Bank;

public class SavingAccount extends Account{
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankName, String iFSc, String branchName,
			double balance) {
		super(accNo, accHolderName, bankName, iFSc, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", AccountNo=" + getAccNo() + ", AccHolderName="
				+ getAccHolderName() + ", BankName=" + getBankName() + ", iFSc=" + getiFSc()
				+ ", BranchName=" + getBranchName() + ", Pin=" + getPin() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	public void withDraw(double amount)  {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Withdraw Successful");
		}else {
			System.out.println("No Suffient Funds");
		}
	}
	
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Deposited Successfully");
	}
	//changePin
	public double checkbalance() {
		return this.getBalance();
	}
	
	
}
