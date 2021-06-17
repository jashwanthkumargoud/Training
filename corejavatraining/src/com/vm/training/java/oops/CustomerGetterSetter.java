package com.vm.training.java.oops;

public class CustomerGetterSetter {
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setId(1001);
		c.setFirstName("Jashu");
		c.setLastName("CH");
		c.setAccount("savings");
		
		System.out.println(c.getId());
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		System.out.println(c.getAccount());
		
		
	}

}
