package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.CallableStatement;
import java.sql.Connection;;

public class ProcedureCall {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DBConnection.getConnection();
			CallableStatement stmt = con.prepareCall("(call findAllRecords())");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.next());
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
