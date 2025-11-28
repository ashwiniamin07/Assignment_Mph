package com.mph.Bank;



/**
 * Hello world!
 *
 */
public class App 

{
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
	
	
	public static void main( ) {
		System.out.println("My own main method");
	}
    public static void main( String[] args )
    {
//    	Employee emp=new Employee();
//        System.out.println(emp);
//        emp.setEmpId(123);
//        emp.setEmpName("swapna");
//        emp.setDesg("trainer");
//        emp.setMobileNum("7795132529");
//        System.out.println(emp);
//        
//        Employee e1=new Employee("amit",678,"Manager","9945432529");
//        System.out.println(e1);
    	Student s1=new Student(123,"swapna",90);
    	Student s2=new Student(123,"swapna",90);
    	
    	System.out.println(s1.hashCode());
    	System.out.println(s2.hashCode());
    	System.out.println(s1==s2);
    	System.out.println(s1.equals(s2));
    	System.out.println(s1.collegeName);
    	System.out.println(s2.collegeName);
    	s1.collegeName="xyz";
    	System.out.println(s2.collegeName);
    	App.main();
    }
    static {
		System.out.println("static block 4");
	}
	
}
