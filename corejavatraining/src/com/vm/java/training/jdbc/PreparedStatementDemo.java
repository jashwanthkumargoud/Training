package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to Digital");
			
			/*PreparedStatement pst = con.prepareStatement("insert into product1 values(?,?,?,?)");
			pst.setInt(1,8);
			pst.setString(2,"Ac");
			pst.setInt(3,59000);
			pst.setString(4,"ele");
			
			pst.execute();
			System.out.println("inserted");
			
		}*/
			
			PreparedStatement pst = con.prepareStatement("insert into student179(name,dept,year) values(?,?,?)");
			pst.setString(1,"bharath");
			pst.setString(2,"ECE");
			
			pst.setString(3,"2020");
			
			pst.execute();
			System.out.println("inserted");
			
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}