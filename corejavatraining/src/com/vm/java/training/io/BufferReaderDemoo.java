package com.vm.java.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class BufferReaderDemoo {

	public static void main(String[] args) throws IOException {
		
		String s ="";
		File f = new File("jashu.txt");
		FileReader fr = new FileReader(f);
		int r = fr.read();
		while(r!= -1)
		{
			s=s+(char)r;
			r=fr.read();
			
		}
		fr.close();
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		FileWriter fw = new FileWriter(f);
		fw.write(s1);
		fw.flush();
		fw.close();
		
	}

}
