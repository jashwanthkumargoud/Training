package com.vm.java.training.collections;

import java.util.ArrayList;

class ComparatoeTest {

	public static void main(String[] args) {
		ArrayList<Product> al = new ArrayList<Product>();
		al.add(new Product(1,"laptop",179));
		al.add(new Product(2,"mobile",178));
		al.add(new Product(3,"desktop",100));
		System.out.println(al);
		for(Product p:al) {
			System.out.println(p);
		}
		
		for(Product p:al) {
			if(p.getPrice()>100) {
				System.out.println(p.getName());
				
			}
		}

	}

}
