package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MethodsQuery {

	
			
			
			static void add(Connection con) throws Exception
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the id no");
				int id =sc.nextInt();
				System.out.println("enter the employee name");
				String name = sc.next();
				System.out.println("enter the salary");
				int salary = sc.nextInt();
				System.out.println("enter the dept");
				String dept = sc.next();
				System.out.println("enter the age");
				int age = sc.nextInt();
				System.out.println("enter the college name");
				String clg =sc.next();
				System.out.println("enter the school name");
				String school = sc.next();
				PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?,?,?,?)");
				pst.setInt(1,id);
				pst.setString(2,name);
				pst.setInt(3,salary);
				pst.setString(4,dept);
				pst.setInt(5, age);
				pst.setString(6, clg);
				pst.setString(7, school);
				pst.execute();
				System.out.println("inserted");
			}
			
			static void viewall(Connection con) throws Exception
			{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from emp");
				
				while(rs.next()) 
				{
					System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ "" +rs.getInt(3)+ ""
					+rs.getString(4)+""+rs.getInt(5)+""+rs.getString(6)+""+rs.getString(7));
					
				}	
			}
			static void viewbyid(Connection con) throws Exception{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the id to search");
				int search_id = sc.nextInt();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from emp where id = ?");
				
				
			}
			
			public static void main(String[] args) {

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?autoReconnect=true&useSSL=false","root","root");
					System.out.println("connected to Digital");
				
					
					
				}
		catch(Exception e) {

		}

	}

}
