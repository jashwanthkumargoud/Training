package com.vm.training.java.exception;
import java.io.*;
public class FileNotFoundTest {

	public static void main(String[] args) {
		
		File f = new File("D:\\jashu.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\jashu.txt");
			while(fis.read()!=-1) {
				System.out.println(fis.read());
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
