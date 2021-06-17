package com.vm.java.training.stream;


import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		//List<Integer> l = Arrays.asList(2,3,4,5,7,15,18);
		
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(6);
		nums.add(76);
		nums.add(54);
		
		System.out.println("number" +nums);
		
		nums.forEach(s-> System.out.println(s));
		
//		nums.forEach(s->System.out::print);
		
		long count = nums.stream().count();
		System.out.println("total elements present in stream " +count);
		System.out.println("no greater than 5");
		nums.stream().filter(s->s>2).forEach(s->System.out.println(s));
		System.out.println("---map---");
		nums.stream().map(s->s+100).forEach(s->System.out.println(s));
		
		

	}

}
