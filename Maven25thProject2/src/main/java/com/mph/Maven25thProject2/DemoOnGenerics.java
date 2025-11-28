package com.mph.Maven25thProject2;

import java.util.Arrays;

public class DemoOnGenerics {
	
	public static <T>void display(T data) {
		System.out.println("Data is "+data);
	}
	public static <T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1);
		System.out.println(u1);
		System.out.println(t1.intValue()+u1.intValue());
	}
	public static void main(String[] args) {
//		Container<String> c1=new Container<String>();
//		c1.setItem("Swapna");
//		System.out.println(c1.getItem());
//		
//		Container<Student> c2=new Container<Student>();
//		Student s=new Student();
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(67);
//		System.out.println(c3.getItem());
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer[] irr= {45,67,23,90,11};
//		c4.setItem(irr);
//		System.out.println(Arrays.toString(c4.getItem()));
		
//		Pair<String,Double> p1=new Pair<String,Double>("distance in km",7.5);
//		System.out.println(p1);
//		Pair<String,Double> p2=new Pair<String,Double>("weight in kg",6.0);
//		System.out.println(p2);
//		Pair<Integer,String> p3=new Pair<Integer,String>(12354,"Laptop");
//		System.out.println(p3);
//		
//		Student s=new Student(234,"Amit","Java");
//		Pair<Integer,Student> p4=new Pair<Integer,Student>(1,s);
//		
//		System.out.println(p4);
//		
//		Order<String> o1=new Order<String>("Laptop");
//		Order<String> o2=new Order<String>("Mobile");
//		System.out.println(o1);
//		System.out.println(o2);
//		
//		Item item=new Item(12,"Laptop",50000);
//		Order<Item> o3=new Order<Item>(item);
//		System.out.println(o3);
//		
//		//create an array of items, create order for this item array
//		
//		Item[] itemArr=new Item[3];
//		Item i1=new Item(13,"MacBook",100000);
//		Item i2=new Item(14,"Tv",1465000);
//		Item i3=new Item(14,"Fridge",60000);
//		
//		itemArr[0]=i1;
//		itemArr[1]=i2;
//		itemArr[2]=i3;
//		
//		Order<Item[]> o4=new Order<Item[]>(itemArr);
//		System.out.println(Arrays.toString(o4.getItem()));
//		
//		int nums[]= {4,5,6,7,8,9,0};
//		String strs[]= {"str1","str2","str3","str4"};
//		ArrayPrinter<Integer> ap1=new ArrayPrinter<>();
//		ArrayPrinter<String> ap2=new ArrayPrinter<>(strs);
		display("swapna");
		display(34);
		display(true);
		Item item=new Item(11,"Mobile",30000);
		display(item);
		add(5,6);
		//add("swapna","motupally");

	}

}
