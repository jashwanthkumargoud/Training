package com.vm.entity;

public class Address {
	
	private int no;
	private String street;
	private String city;
	
	public Address(int no, String street, String city) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
	}
	
	public void displayaddressdetails()
	{
		System.out.println("====Displays Address====");
		System.out.println("h no"+no);
		System.out.println("street " +street);
		System.out.println("city" +city);
		System.out.println("========================");
		
	}

}
