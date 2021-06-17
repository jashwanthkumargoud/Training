package com.vm.java.training.io;

import java.io.File;
import java.io.IOException;

public class CreateDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("jashwanth.txt");
		File f2 = new File("D:\\jashhhh.txt");
		System.out.println(f2.exists());
		if(f2.exists()) {
			System.out.println("file is present ");
		}
		else {
			System.out.println("no file is present");
			f2.createNewFile();
			System.out.println("file is created");
		}
		
		

	}

}
