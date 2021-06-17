package com.vm.java.training.serilizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		
		Employee emp = new Employee(1,"john");
		
		FileOutputStream file = new FileOutputStream("bharath.txt");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		
		oos.writeObject(emp);
		
		System.out.println(" done ");
		oos.flush();
		oos.close();
		

	}

}
