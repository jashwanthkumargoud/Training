package com.vm.java.training.collections;

import java.util.*;

public class Combine {
	public static void main(String args[])
	{


		ArrayList<String> list1 = new ArrayList<String>();


		list1.add("Jashu");
		list1.add("kumar");
		list1.add("Goud");


		System.out.println("ArrayList 1: " + list1);


		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("jashwanth");
		list2.add("CH");
		list2.add("cheruku");
		
		list2.removeAll(list2);


		System.out.println("ArrayList 2: " + list2);


		list1.addAll(list2);
		Collections.sort(list2);


		System.out.println("Joined ArrayLists: "
				+ list1);
	}
}
