package com.mph.Bank;

import java.util.Objects;

public class Student {
	
	private int stdId;
	private String stdName;
	private double marks;
	
	public static String collegeName="MITE";
	
	public Student(int stdId, String stdName, double marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(marks, stdId, stdName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks) && stdId == other.stdId
				&& Objects.equals(stdName, other.stdName);
	}
	static class College{
		private String colName;
		private String location;
		private long colCode;
		public College(String colName, String location, long colCode) {
			super();
			this.colName = colName;
			this.location = location;
			this.colCode = colCode;
		}
		public College() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getColName() {
			return colName;
		}
		public void setColName(String colName) {
			this.colName = colName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getColCode() {
			return colCode;
		}
		public void setColCode(long colCode) {
			this.colCode = colCode;
		}
		@Override
		public String toString() {
			return "College [colName=" + colName + ", location=" + location + ", colCode=" + colCode + "]";
		}
		
		
	}
	
	

	

}
