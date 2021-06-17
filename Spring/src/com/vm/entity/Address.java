package com.vm.entity;

public class Address {
	
	private int doorno;
	private String StreetName;
	private String city;
	
	
	
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayEmployeeInfo() {
		
		System.out.println("door: "+doorno);
		System.out.println("street: " +StreetName);
		System.out.println("city: "+city);
	}
	
	

}
