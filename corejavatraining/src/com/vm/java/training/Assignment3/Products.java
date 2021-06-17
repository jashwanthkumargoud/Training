package com.vm.java.training.Assignment3;

public class Products {
	
	private int pid;
	private String name;
	private String category;
	private int price;
	private int quantity;
	
	
	public Products(int pid, String name, String category, int price, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", name=" + name + ", category=" + category + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	

}
