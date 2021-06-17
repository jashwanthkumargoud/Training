package com.vm.java.training.collections;
import java.util.*;

public class Emp {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("First", "FIRST INSERTED");
		ht.put("Second", "SECOND INSERTED");
		ht.put("Third", "THIRD INSERTED");
		System.out.println(ht);
		Set<String> keys = ht.keySet();
		for(String key: keys) {
			System.out.println("Value of " +key+" is: " +ht.get(key));
		}
		
		
		
		
		
		
		

	}

}
