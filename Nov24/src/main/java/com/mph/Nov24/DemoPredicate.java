package com.mph.Nov24;

import java.util.function.Predicate;

public class DemoPredicate {

	public static void main(String[] args) {
		Predicate<Integer> isEven=(n)->n%2==0;
		System.out.println(isEven.test(5));
		
		System.out.println(isEven.test(56)?"even":"odd");
		
		Predicate<String> checkLength=(str)->str.length()>7;
		System.out.println(checkLength.test("Ashwiniamin"));
		
		Employees emp1=new Employees(123,"swapna",70000);
        Employees emp2=new Employees(124,"ashwini",30000);
        Employees emp3=new Employees(125,"anvitha",90000);
        Employees emp4=new Employees(126,"prathith",80000);
        Employees emp5=new Employees(127,"shivani",50000);
        
        Employees[] empArr= {emp1,emp2,emp3,emp4,emp5};
        
        Predicate<Employees> checkSalary=(emp)->emp.getEmpSalary()>=50000;
        
        for(Employees e:empArr) {
        	if(checkSalary.test(e))
        		System.out.println(e);
        }
        
//        //qn1
//        String str[]= {"ashwin","makara","prathith","anvitha"};
//        Predicate<String> startsWith=()->str.charAt(0)=='a';
       

	}

}
