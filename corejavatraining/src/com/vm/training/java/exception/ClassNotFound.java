package com.vm.training.java.exception;

public class ClassNotFound {

	public static void main(String[] args) {
		
		try {
			Class.forName("D:\\jashu.txt");
			System.out.println("found class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
