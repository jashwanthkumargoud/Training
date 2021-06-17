package com.vm.training.java.oops;

public class Employee {
	
	int id;
	String name;
	String dept;
	
	Employee(){}
	
	public Employee(int id, String name, String dept) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
	
	public String toString() {
		
		return id+"   "+name+"   "+dept;
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Employee emp1 = new Employee(100,"jashu","CSE");
		
		System.out.println(emp);
		System.out.println(emp1);

	}

}
