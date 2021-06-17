package com.vm.java.training.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlConnection {

	public static void main(String[] args) {
		
		//step-1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.vm.java.training.jdbc.Driver");
			System.out.println("driver class loaded");
			//step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to Digital");
			
			//step-3
			Statement stmt = con.createStatement();
			//stmt.execute("create table Driver(name varchar(20))");
			stmt.execute("insert into driver values('jashwanth')");
			stmt.executeQuery("select * from driver");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
