package com.vm.java.training.newfeatures;



interface Test
{
	void display();
}


public class LambdaExpression {

	public static void main(String[] args) {
		
		Test t = ()->{
			System.out.println("hello");
		};
		t.display();
		
		
		Test t1 = ()-> System.out.println("hello lambda expression");
		t1.display();

	}

}
