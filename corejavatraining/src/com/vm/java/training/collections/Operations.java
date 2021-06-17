package com.vm.java.training.collections;
import java.util.*;
public class Operations {
	
	
	static void asscending(ArrayList al) {
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new <Integer>ArrayList();
		al.add(1);
		al.add(3);
		al.add(14);
		al.add(5);
		al.add(7);
		al.add(8);
		System.out.println("In asscending order");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Indecending order");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		System.out.println("minimum value ");
		Collections.min(al);
		
		System.out.println(al);
		System.out.println("maximum value ");
		Collections.max(al);
		System.out.println(al);
		
		 

	}

}
