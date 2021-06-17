package com.vm.java.training.newfeatures;


interface Validate {
	void validateLogin();
	
}

class Car{
	void myLogin() {
		System.out.println("you can login ");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		Validate v = ()-> System.out.println("login validate ");
		v.validateLogin();
		Car c = new Car();
		
		Validate v1 = c::myLogin;
		v1.validateLogin();

	}

}
