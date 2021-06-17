package com.vm.training.java.string;

public class ByteArray {

	public static void main(String[] args) {
		
		String str = " core java api ";
		byte[] b = str.getBytes();
		System.out.println("String Length: "+str.length());
		System.out.println("Byte array length: " +b.length);
		
	}

}
