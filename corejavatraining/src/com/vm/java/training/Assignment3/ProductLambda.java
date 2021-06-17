package com.vm.java.training.Assignment3;

import java.util.ArrayList;

public class ProductLambda {

	public static void main(String[] args) {
		
		ArrayList<Products> arraylist = new ArrayList<Products>();
		arraylist.add(new Products(1,"One Plus","mobile",60000,20));
		arraylist.add(new Products(2,"Apple","Mobile",100000,10));
		arraylist.add(new Products(3,"Samsung","Mobile",150000,5));
		arraylist.add(new Products(4,"mi","Mobile",15000,100));
		arraylist.add(new Products(1,"Realmi","Mobile",12000,80));
		
		arraylist.forEach(System.out::println);
		
		arraylist.stream().filter(s -> s.getName()).forEach(System.out::println);
		arraylist.stream().filter(where );
		
		Employee
	

	}

}
