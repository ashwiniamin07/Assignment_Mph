package com.mph.Bank;

public class Employee {
	
	private String empName;
	private int empId;
	private String desg;
	private String mobileNum;
	
	public Employee(String empName, int empId, String desg, String mobileNum) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.desg = desg;
		this.mobileNum = mobileNum;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", desg=" + desg + ", mobileNum=" + mobileNum
				+ "]";
	}
	
	

}
