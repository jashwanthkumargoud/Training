package com.vm.entity;

public class Order {
	
	private int orderId;
	private String productName;
	private int quantity;
	
	
	public Order(int orderId, String productName, int quantity) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.quantity = quantity;
	}
	
	void displayorderdetails() {
		System.out.println("======order details=====");
		System.out.println("order id" +orderId);
		System.out.println("product name" +productName);
		System.out.println("quantity" +quantity);
		System.out.println("===========================");
	}

}
