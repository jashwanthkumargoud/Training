package com.vm.training.java.exception;


class Training{
	
	void train() throws Exception {
		System.out.println("zero know");
	}
	
	void trainAll() throws Exception
	{
		specific();
		System.out.println("can train all");
	}
	
	void specific() throws Exception 
	{
		train();
		System.out.println("can only train in java");
	}
	
}
public class ThrowsTest {
	
	public static void main(String[] args) throws Exception {
		Training t = new Training();
		t.train();
		
	}

}
