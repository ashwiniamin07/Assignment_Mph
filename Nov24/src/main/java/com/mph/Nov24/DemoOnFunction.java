package com.mph.Nov24;

import java.util.function.Function;

public class DemoOnFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction=(num)->num*num;
		int arr[]= {3,2,4,5,6};
		for(int i:arr)
			System.out.println(squareFunction.apply(i));
		
		Employees emp1=new Employees(123,"swapna",70000);
        Employees emp2=new Employees(124,"ashwini",60000);
        Employees emp3=new Employees(125,"anvitha",90000);
        Employees emp4=new Employees(126,"prathith",80000);
        Employees emp5=new Employees(127,"shivani",50000);
        
        Employees[] empArr= {emp1,emp2,emp3,emp4,emp5};
        
        Function<Employees,String> uppFunction=(e)->e.getEmpName().toUpperCase();
        for(Employees e1:empArr)
        	System.out.println(uppFunction.apply(e1));
        
        Function<Integer,Integer> add20=(num)->num+20;
        System.out.println(squareFunction.andThen(add20).apply(5));
        
        Function<Employees,Employees> checkSalary=(e)->{
        	if(e.getEmpSalary()>50000)
        		return e;
        	else
        		return null;
        };
        
        

	}

}
