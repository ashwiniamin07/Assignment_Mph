package com.mph.Maven26thProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(56);
		hashSet.add(34);
		hashSet.add(99);
		hashSet.add(99);
		System.out.println(hashSet);
		for(Integer i:hashSet)
			System.out.println(i);
		
		Iterator<Integer> itr=hashSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		hashSet.add(null);
		System.out.println(hashSet);
		
		LinkedHashSet<Integer> llHashSet=new LinkedHashSet<>();
		llHashSet.add(50);
		llHashSet.add(60);
		llHashSet.add(70);
		llHashSet.add(80);
		llHashSet.add(90);
		System.out.println(llHashSet);
		
	
	}

}
