package com.vm.training.java.oops;
public static void main(String[] args) {
public class GrandFather {
	
	int age;
	
	public GrandFather(int age) {
		this.age = age;
	}
	
	void walk() {
		System.out.println("cant walk"+age);
	}
}

class Father extends GrandFather{
	int myAge;
	super(age);
	this.myAge = myAge;
}
	void walk() {
		System.out.println("cant walk" +myAge);
	}
	voidshow(){}
}

class son extends Father{
	int myTeenAge;
	son(int age,int myAge,int myTeenAge){
		super(age,myAge);
		this.myTeenAge = myTeenAge;
	}
	void walk() {
		System.out.println("walking in ");
	}
		// TODO Auto-generated method stub

	}

}
