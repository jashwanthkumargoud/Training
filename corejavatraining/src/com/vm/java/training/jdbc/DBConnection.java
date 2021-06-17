package com.vm.java.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection implements JDBCProperties{

	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(JDBCProperties.URL,JDBCProperties.USERNAME,JDBCProperties.PASSWORD);
	}
}
