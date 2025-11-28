package com.mph.Maven26thProject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		Integer arr[]= {56,34,12,21,07,29};
		LinkedList<Integer> ll=new LinkedList<Integer> (Arrays.asList(arr));
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(ll.offer(95));
		System.out.println(ll);
		System.out.println(ll.peekLast());
		ll.addFirst(07);
		System.out.println(ll);
		ll.addLast(12);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
	}

}
