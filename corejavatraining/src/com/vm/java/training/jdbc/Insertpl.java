package com.vm.java.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Insertpl {



		public static void main(String[] args) {
			
			try {
				
				Connection con = DBConnection.getConnection();
				CallableStatement stmt = (CallableStatement) con.prepareCall("{call insertnewemp(?,?,?)}");
				stmt.setInt(1, 9);
				stmt.setString(2, "xyz");
				stmt.setInt(3, 6770);
				
				stmt.execute();
				stmt.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			

		}

	}
