package com.mph.Maven26thProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoOnArrayList {

	public static void main(String[] args) {
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("swapna");
//		alist.add(true);
//		alist.add(89.76);
//		Person p=new Person("swapna", 12345);
//		alist.add(p);
//		
//		System.out.println(alist.get(2));
//		alist.add(null);
//		System.out.println(alist);
//		
//		ArrayList<String> namesList=new ArrayList<>();
//		namesList.add("amit");
//		namesList.add("preethi");
//		namesList.add("varun");
//		namesList.add("keerthi");
////		System.out.println(namesList);
////		
////		for(String name:namesList)
////			System.out.println(name);
////		
////		Iterator<String> itr=namesList.iterator();
////		while(itr.hasNext())
////			System.out.println(itr.next());
////		
////		System.out.println("using list iterator");
////		Iterator<String> litr=namesList.listIterator();
////		while(litr.hasNext())
////			System.out.println(litr.next());
//		
//		namesList.add(0, "Ashwini");
//		namesList.contains("amit");
//		for(String name:namesList)
//			System.out.println(name);
//		System.out.println("for each");
//		namesList.forEach(name->System.out.println(name));//consumer using lambda
//		namesList.forEach(System.out::println);//consumer using mr
//		System.out.println(namesList.remove(1)+" got removed");
//		
//		Integer arr[]= {2,3,4,5,6,7};
//		Integer brr[]= {1,2,3,4,5};
//		List<Integer> numList1=new ArrayList(Arrays.asList(arr));
//		List<Integer> numList2=new ArrayList(Arrays.asList(brr));
//		System.out.println("Before retainAll "+numList1);
//		numList1.retainAll(numList2);
//		System.out.println("After retainAll "+numList1);
//		Collections.sort(namesList);
//		System.out.println("After Sorting"+namesList);
//		ArrayList<String> clonedNamesList=(ArrayList<String>) namesList.clone();
//		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
//		//clonedNamesList.add("swapna");
//		namesList.add("swapna");
////		System.out.println(namesList.hashCode());
//		System.out.println(clonedNamesList.hashCode());
		
		ArrayList<Student> studentList=new ArrayList<>();
		studentList.add(new Student(128,"swapna",22,"bangalore",90.00));
		studentList.add(new Student(124,"ashwini",23,"hyderabad",80.00));
		studentList.add(new Student(125,"anvitha",24,"mumbai",70.00));
		studentList.add(new Student(126,"shivani",25,"mysore",88.00));
		studentList.add(new Student(127,"shekhar",26,"hyderabad",99.00));
		studentList.add(new Student(121,"prathith",22,"bangalore",50.00));
		studentList.add(new Student(122,"ashwini",23,"mangalore",80.00));
		studentList.add(new Student(123,"anvitha",24,"bangalore",70.00));
		studentList.add(new Student(129,"shivani",25,"mysore",88.00));
		studentList.add(new Student(130,"sinchu",26,"hyderabad",65.00));
		//System.out.println(studentList);
		System.out.println("Before Sorting");
		for(Student s:studentList)
			System.out.println(s);
		
		//Collections.sort(studentList);
		studentList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new MarksComparator()));
		System.out.println("After sortig");
		for(Student s:studentList)
			System.out.println(s);
	}

}
