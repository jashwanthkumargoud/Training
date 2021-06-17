package com.vm.java.training.Assignment3;

import java.util.ArrayList;


public class Sorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(6);
		nums.add(19);
		nums.add(12);
		
		nums.forEach(System.out::println);
		
		System.out.println("--sorting--");
		nums.stream().sorted().forEach(System.out::println);
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("jahu");
		al.add("bharath");
		al.add("Jaideep");
		al.add("rahul");
		al.forEach(System.out::println);
		al.stream().sorted().forEach(System.out::println);
		
		
		al.stream().sorted((s1,s2)->
		{
			if
		}
		
		
		

	}

}
