package com.vm.java.training.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferReaderDemo {
public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		File f = new File("Desktop");
		FileWriter fr = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fr);
		br.write("ID\t\tName\t\tAge");
		System.out.print("Number of persons: ");
		int n1 =sc.nextInt();
		while(n1-->0)
		{System.out.print("Enter ID number:");
			String id = sc.next();
			System.out.print("Enter Name ");
			String name =sc.next();
			System.out.print("Enter Age ");
			String age=sc.next();
			br.newLine();
			br.write(id+"\t\t"+name+"\t\t"+age);
		}
	
		
		br.flush();
		br.close();
		
		
		
	} catch (Exception e) {
		
	}
}
}