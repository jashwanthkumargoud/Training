package com.vm.training.java.oops;

public class Emp {

	public static void main(String[] args) {
		
		EmpGettersSetters egs = new EmpGettersSetters();
		egs.setId(1001);
		egs.setName("Jashu");
		egs.setDept("CSE");
		
		System.out.println(egs.getId());
		System.out.println(egs.getName());
		System.out.println(egs.getDept());

	}

}
