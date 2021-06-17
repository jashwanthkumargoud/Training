package com.vm.training.java.oops;

public class TestAccociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void showaggregation() {
		Address a = new Address();
		a.setCity("hyd");
		a.setState("Telangana");
		a.setCountry("INDIA");
		
		EmpAsso ea = new EmpAsso();
		ea.setId(179);
		ea.setName("jashu");
		ea.setAddress(a);
		
		System.out.println(ea);
		
		System.out.println("-------");
		
		ea = null;
		System.out.println(ea);
		System.out.println(a);
		
		
		
		
	}
	
	static void showcomposition() {
		
		
	}

}
