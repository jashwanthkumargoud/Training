package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.ResultSetMetaData;

public class RetriveDemo {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to Digital");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("column count " +rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1)+ " \t" + rsmd.getColumnName(2)+" \t\t"+rsmd.getColumnName(3));
			
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" \t"+rs.getString(2)+" \t"+rs.getInt(3));
			}
		}
		catch (Exception e) {
			
		}

	}

}
