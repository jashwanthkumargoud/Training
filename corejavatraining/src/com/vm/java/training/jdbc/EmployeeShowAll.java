package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeShowAll {

	public static void addall() throws Exception {
		Connection con=DBConnection.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)); 
		}
	}
}

