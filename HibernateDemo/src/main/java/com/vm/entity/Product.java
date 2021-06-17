package com.vm.entity;

public class Product {
	
	private int product_Id;
	private String product_Name;
	private String category;
	private int price ;
	
	public Product() {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.category = category;
		this.price = price;
	}

	

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
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

	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
}
