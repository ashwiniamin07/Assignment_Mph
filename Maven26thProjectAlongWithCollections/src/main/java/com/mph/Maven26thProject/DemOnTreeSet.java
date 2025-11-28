package com.mph.Maven26thProject;

import java.util.Iterator;
import java.util.TreeSet;

public class DemOnTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet=new TreeSet<>();
		treeSet.add(34);
		treeSet.add(12);
		treeSet.add(90);
		treeSet.add(56);
		System.out.println(treeSet);
		
		System.out.println(treeSet.ceiling(39));
		Iterator<Integer> itr=treeSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(treeSet.headSet(56));
		System.out.println(treeSet.tailSet(56));
		
		System.out.println(treeSet.higher(90));
		
		TreeSet<Student> stuTreeSet=new TreeSet();
		stuTreeSet.add(new Student(128,"swapna",22,"bangalore",90.00));
		stuTreeSet.add(new Student(124,"ashwini",23,"hyderabad",80.00));
		stuTreeSet.add(new Student(125,"anvitha",24,"mumbai",70.00));
		stuTreeSet.add(new Student(126,"shivani",25,"mysore",88.00));
		stuTreeSet.add(new Student(127,"shekhar",26,"hyderabad",99.00));
		
		System.out.println(stuTreeSet);
	}

}
