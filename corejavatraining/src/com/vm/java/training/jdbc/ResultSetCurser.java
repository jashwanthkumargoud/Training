package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetCurser {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.vm.java.training.jdbc.Driver");
			System.out.println("driver class loaded");
			//step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to Digital");
			
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs= stmt.executeQuery("select * from emp");
			
			rs.first();
			System.out.println(rs.getInt(1)+""+rs.getString(2));
		}catch (Exception e) 
		{
			
		}

	}

}
