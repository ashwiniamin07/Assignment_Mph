package com.mph.Maven29Junit;


public class App {
	
	public String sayHello() {
		return "hello";
	}
	
	public String checkText() {
		String str="ashwini";
		return str;
	}
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app=new App();
        app.sayHello();
    }
}
