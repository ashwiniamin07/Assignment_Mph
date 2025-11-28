package com.mph.Maven26thProject;

public class Student implements Comparable<Student>{
	private int sid;
	private String sname;
	private int age;
	private String city;
	private double marks;
	public Student(int sid, String sname, int age, String city, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", city=" + city + ", marks=" + marks
				+ "]";
	}
//	@Override
//	public int compareTo(Student s) {
//		
//		return this.sid-s.sid;
//	}
//	@Override
//	public int compareTo(Student o) {
//		
//		return this.sname.compareTo(o.sname);
//	}
	@Override
	public int compareTo(Student o) {
		
		return this.sname.compareTo(o.sname);
	}
	
	
}
