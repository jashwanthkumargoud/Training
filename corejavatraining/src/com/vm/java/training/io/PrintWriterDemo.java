package com.vm.java.training.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.write(97);
		pw.print(97);
		
		pw.flush();
		pw.close();
		

	}

}
