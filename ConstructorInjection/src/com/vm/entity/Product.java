package com.vm.entity;

public class Product {
	
	
	private int id;
	private String name;
	private String category;
	private int price;
	 
	
	public Product(int id, String name, String category, int price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	

}
