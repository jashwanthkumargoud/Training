package com.vm.java.training.io;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
		
		File f = new File("movies");
		System.out.println(f.exists());
		f.mkdir();// it will create folder
		System.out.println(f.exists());
		

	}

}
