package com.mph.Maven26thProject;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
//		HashMap<Integer,String> hashMap=new HashMap<>();
//		hashMap.put(1, "baglr");
//		hashMap.put(43, "hyder");
//		hashMap.put(23, "chennai");
//		hashMap.put(53, "mumbai");
//		System.out.println(hashMap);
//		
//		System.out.println(hashMap.keySet());
//		System.out.println(hashMap.values());
//		System.out.println(hashMap.entrySet());
//		System.err.println(hashMap.get(3));
//		
//		Set<Integer> keySet=hashMap.keySet();
//		Set<String> valueSet=new HashSet<> (hashMap.values());
//		
//		Iterator<Integer> keyItr=keySet.iterator();
//		while(keyItr.hasNext())
//			System.out.println(keyItr.next());
//		
//		Iterator<String> valueItr=valueSet.iterator();
//		while(valueItr.hasNext())
//			System.out.println(valueItr.next());
//		
//		Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
//		while(entryItr.hasNext())
//			System.out.println(entryItr.next());
		
		TreeMap<Integer,Integer> treeMap=new TreeMap<>();
		treeMap.put(1, 1);
		treeMap.put(2, 4);
		treeMap.put(7, 49);
		treeMap.put(6, 36);
		treeMap.put(4, 16);
		System.out.println(treeMap);
		
		
		Hashtable<Integer,String> table=new Hashtable<Integer,String>();
		table.put(3, "swapna");
		table.put(2, "amit");
		table.put(8, "raj");
		table.put(7, "ram");
		
		System.out.println(table);
		
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		
		Enumeration<String> values=table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
	}

}
