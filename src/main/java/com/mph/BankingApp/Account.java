package com.mph.BankingApp;

abstract public class Account {
	private long accNo;
	private String accHolderName;
	private String bankname;
	private String iFSC;
	private String branchName;
	private int pin;
	public Account() {
		super();
	}
	public Account(long accNo, String accHolderName, String bankname, String iFSC, String branchName) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bankname = bankname;
		this.iFSC = iFSC;
		this.branchName = branchName;
		this.pin=generatePin();
	}
	private int generatePin() {
		int newPin=(int)Math.round(Math.random()*10000);
		return newPin;
	}
	
	
	
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getiFSC() {
		return iFSC;
	}
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getPin() {
		return pin;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", bankname=" + bankname + ", iFSC="
				+ iFSC + ", branchName=" + branchName + ", pin=" + pin + "]";
	}
	
	
	
	public abstract void withDraw(double amount) ;
	
	
	public abstract void deposit(double amount) ;
}
