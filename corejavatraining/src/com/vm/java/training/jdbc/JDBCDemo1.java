package com.vm.java.training.jdbc;

public class JDBCDemo1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.vm.java.training.jdbc.A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
