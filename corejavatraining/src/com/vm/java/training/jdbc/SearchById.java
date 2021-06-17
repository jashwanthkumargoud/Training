package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchById {

	public static void search() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to search");
		int id1=sc.nextInt();
		Connection con=DBConnection.getConnection();
		PreparedStatement ps1=con.prepareStatement("select * from employee where empid=?");
		ps1.setInt(1, id1);
		ResultSet rs1=ps1.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4)+" "+rs1
					.getInt(5)); 
							}

	}

}
