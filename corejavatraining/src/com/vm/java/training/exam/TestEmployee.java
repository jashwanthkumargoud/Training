package com.vm.java.training.exam;

public class TestEmployee {
public static void main(String[] args) throws Exception {
	Employee e = new Employee(null, null);
	e.validation();
	Employee e1 = new Employee("CH", "R");
	e1.validation();
	Employee e2= new Employee("Jashwanth", "Kumar"); 
	e2.validation();
	
}
}
