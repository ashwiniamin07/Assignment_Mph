package com.mph.Nov24;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {
		
		Consumer<Integer> squareConsumer=(num1)->{
			System.out.println( num1=num1*num1);   
		};
		squareConsumer.accept(5);
		
		Consumer<Integer[]> sortConsumer=(arr)->{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		
		Integer arr[]= {45,76,12,90,543,9};
		sortConsumer.accept(arr);
		
		Employees emp1=new Employees(123,"swapna",70000);
        Employees emp2=new Employees(124,"ashwini",60000);
        Employees emp3=new Employees(125,"anvitha",90000);
        Employees emp4=new Employees(126,"prathith",80000);
        Employees emp5=new Employees(127,"shivani",50000);
        
        Employees[] empArr= {emp1,emp2,emp3,emp4,emp5};
        
        Consumer<Employees[]> printConsumer=(err)->{
        	for(Employees e:err)
        		System.out.println(e.getEmpName());
        		
        	
        };
        printConsumer.accept(empArr);
		
		

	}

}
