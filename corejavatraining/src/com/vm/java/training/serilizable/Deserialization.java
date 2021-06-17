package com.vm.java.training.serilizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("bharath.txt");
		ObjectInputStream ois = new ObjectInputStream(file);
		
		Employee e = (Employee) ois.readObject();
		
		System.out.println(e.id +" "+e.name);
		
		
	}

}
