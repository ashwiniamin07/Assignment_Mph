package com.mph.Nov24;

import java.util.Arrays;

/**
 * Hello world!
 */
interface MyComparator{
	//public int salComparator(Employees emp1,Employees emp2);
	public int NameComparator(Employees emp1,Employees emp2);
}
public class App {
    public static void main(String[] args) {
        Employees emp1=new Employees(123,"swapna",70000);
        Employees emp2=new Employees(124,"ashwini",60000);
        Employees emp3=new Employees(125,"anvitha",90000);
        Employees emp4=new Employees(126,"prathith",80000);
        Employees emp5=new Employees(127,"shivani",50000);
        
        Employees[] empArr= {emp1,emp2,emp3,emp4,emp5};
//        MyComparator comparator=(e1,e2)->Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
//        Arrays.sort(empArr,(e3,e4)->comparator.salComparator(e3, e4));
        
        
        
        
        
        Arrays.sort(empArr,(e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
        for(Employees employee:empArr) {
        	System.out.println(employee);
        }
    }
}
