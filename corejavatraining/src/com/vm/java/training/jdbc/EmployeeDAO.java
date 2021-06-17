package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {
	
	public static void addEmployee(Employee employee) throws Exception
	 {
		 Connection con=DBConnection.getConnection();
		 PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		 //Scanner sc=new Scanner(System.in);
		 ps.setInt(1, employee.getEmpid());
		 ps.setString(2, employee.getEmpname());
		 ps.setString(3,employee.getLob());
		 ps.setInt(4,employee.getSalary());
		 ps.setInt(5,employee.getAge());
		 
	 }
	

}
