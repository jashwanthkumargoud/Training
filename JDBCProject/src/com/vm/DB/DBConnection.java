package com.vm.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.PreparedStatement; 

public class DBConnection {
	
public static void main(String[] args) {
		
		//step-1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("driver class loaded");
			Scanner scanner = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
			System.out.println("connected to Digital");
			
			PreparedStatement pst = con.prepareStatement("insert into cafetria(item_Id,item_Name,item_Price) values(?,?,?)");
			 if (pst != null) { 
			 System.out.println("enter the no of items to be inserted");
			 int n = scanner.nextInt();
	                for (int i = 1; i <= n; i++) { 
	                    System.out.println("Enter " + i + " item_details"); 
	                    System.out.println("Enter item No : "); 
	                    int item_Id = scanner.nextInt(); 
	                    System.out.println("Enter Item Name : "); 
	                    String item_Name = scanner.next(); 
	                    System.out.println("Enter item Price : "); 
	                    int item_Price = scanner.nextInt();
	                    pst.setInt(i, item_Id);
	                    pst.setString(i, item_Name);
	                    pst.setInt(i, item_Price);
	                  
	                }
			 }
			 else {
				 System.out.println("items cannot be inserted ");
			 }
		}
			 catch (Exception e) {
			 }
}
}
			 

			