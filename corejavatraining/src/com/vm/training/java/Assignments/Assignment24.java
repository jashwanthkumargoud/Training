package com.vm.training.java.Assignments;
import java.util.*;
abstract class Book {
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	void setTitle(String s) {
		super.title=s;
	}
}
public class Assignment24{
	public static void mainString(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s="";
		s+=sc.nextLine();
		MyBook mb = new MyBook();
		mb.setTitle(s);
		System.out.print("The Title is:" +mb.getTitle());
		
	}
}


