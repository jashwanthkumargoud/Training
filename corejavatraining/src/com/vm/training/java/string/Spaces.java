package com.vm.training.java.string;
import java.util.*;

import sun.security.tools.jarsigner.Main;
public class Spaces {
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" Enter the string ");
    	String str = sc.next() ;
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", " ");
       
        System.out.println(str);
    }
}

