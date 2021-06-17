package com.vm.entity;

public class Employee {
	
	private int id;
	private String name;
	private String dept;
	
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("----employee details----");
		System.out.println("entered id number "+id);
		System.out.println("your name "+name);
		System.out.println("department name "+dept);
		System.out.println("----address----");
		address.displayEmployeeInfo();
		
	}
	
	
	
	

}
