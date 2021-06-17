package com.vm.java.training.collections;
import java.util.ArrayList;
public class ArrayTest extends Object {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList(20);
		arraylist.add("jashwanth");
		arraylist.add("kumar");
		arraylist.add("Goud");
		arraylist.add("Cheruku");
		arraylist.add(new Integer(10));
		arraylist.add(new Float(10.90));
		System.out.println(arraylist);
		arraylist.remove(2);
		System.out.println(arraylist);
		arraylist.add(2,"java");
		System.out.println(arraylist);
		System.out.println(arraylist.contains("jashwanth"));
		System.out.println(arraylist.get(3));
		
	}

}
