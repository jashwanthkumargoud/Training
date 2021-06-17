package com.vm.training.java.Assignments;
import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
class Arithematic{
	int add(int a, int b) {
		return  a+b ;
	}
}
class Adder extends Arithematic {}


	public class Assignment23 {

		public static void main(String[] args) {

				Adder add = new Adder();
				System.out.println("My superclass is: Arthmetic");	
				System.out.print(add.add( 20, 20 ));
				System.out.print(" \t ");
				System.out.print(add.add( 6, 7 ));
				System.out.print(" \t ");
				System.out.print(add.add( 10 , 10 ));
			}  
	}
