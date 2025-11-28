package com.mph.Maven26thProject;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
       System.out.println("Immutable class creation");
       System.out.println("Class need to be final\n 2.Properties need to be final"
       		+ "\n 3.Properties need to get value throgh constructor \n"
       		+ "4.No setters to modify data");
       Person p1=new Person("Swapna Motupally", 32453);
       System.out.println(p1);
       
    }
}
