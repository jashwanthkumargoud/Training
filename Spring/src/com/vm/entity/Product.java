package com.vm.entity;

public class Product {
	
	private int id;
	private String name;
	private String category;
	
	
	public Product(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
	
	

}
