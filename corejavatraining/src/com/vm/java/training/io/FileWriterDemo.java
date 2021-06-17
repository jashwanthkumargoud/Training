package com.vm.java.training.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("cheruku.txt");
		FileWriter fw = new FileWriter(f);
		//below line has same has above two lines
		//FileWriter fw1 = new FileWriter(new File("jashhh.txt"));
		
		fw.write("jashwanth");
		fw.write("cheruku");
		
		fw.flush();
		fw.close();
		
		System.out.println("data written ");
		
		

	}

}
