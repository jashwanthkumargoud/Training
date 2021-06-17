package com.vm.training.java.exception;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TryWithR {

	public static void main(String[] args) throws SQLException {
		
		try(FileOutputStream fos = new FileOutputStream(new File("D:\\jashu.txt"))){
				Connection con = DriverManager.getConnection("url","un","ps");
				String s = "VM";
				byte[] by = s.getBytes();
				fos.write(by);
				System.out.println("Success");
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e1) {
		e1.printStackTrace();
	}
	}
}

