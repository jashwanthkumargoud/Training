package com.vm.java.training.jdbc;

import java.sql.Connection;

public class StoredProcedure {

	public static void main(String[] args) {
		
		try {
			Connection con = DBConnection.getConnection();
			con.prepareCall(null);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
