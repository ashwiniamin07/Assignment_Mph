package com.mph.MemoryManagementProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Object creating...");
			MyClass.listItem.add(new int[1000000]);
		}

	}

}
class MyClass{
	static List<int[]> listItem=new ArrayList<int[]>();
}
