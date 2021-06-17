package com.vm.java.training.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class collectionAdd {

	public static void main(String[] args) {
		
		ArrayList<Employee> el = new ArrayList();
		el.add(new Employee(170020179,"jashu","cse",800));
		el.add(new Employee(170030179,"bharath","CSE",650));
		el.add(new Employee(100,"bhavana","MBBS",500));
		el.add(new Employee(170031345,"jaideep","cse",600));
		el.add(new Employee(170030067,"rahul","cse",450));
		el.add(new Employee(170031345,"jaideep","cse",600));
		
		//el.forEach(System.out::println);
		
//		el.stream().filter(s->s.getdept().equalsIgnoreCase("dev").forEach(System.out::println));
//		el.stream().filter()
	//	el.stream().filter(s1->s1.getSalary()>500).count();
//		el.stream().filter(s->s.)
		//long ja=el.stream().filter(s->s.getDept().equals("cse")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
//		List<Employee> uni=el.stream().distinct().collect(Collectors.toList());
		
		//el.stream().skip(2).forEach(System.out::println);
		el.stream().limit(2).forEach(System.out::println);


	}

}
