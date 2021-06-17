package com.vm.training.java.oops;

public class InnerTest {
	
	public static void main(String[] args) {
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.display();
	}

}
