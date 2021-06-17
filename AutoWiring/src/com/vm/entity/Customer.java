package com.vm.entity;

public class Customer {
	
	private int id;
	private String name;
	private Address address;
	private Order order;
	private Order order1;
	
	public void setOrder1(Order order1) {
		this.order1 = order1;
	}

	public void setId(int id) 
	
	{
		this.id = id;
	}
	
	public void setName(String name) 
	
	{
		this.name = name;
	}
	
	public void setAddress(Address address) 
	
	{
		this.address = address;
	}
	
	public void setOrder(Order order) 
	
	{
		this.order = order;
	}
	
	
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", order=" + order + ", order1="
				+ order1 + "]";
	}

	public void displayCustomerInfo() 
	
	{
		System.out.println("====Customer details====");
		System.out.println("id " +id);
		System.out.println("name" +name);
		System.out.println("========================");
		order.displayorderdetails();
		address.displayaddressdetails();
		order1.displayorderdetails();
		
	}

}
