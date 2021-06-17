package com.vm.java.training.interthreadcommunication;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {

	public static void main(String[] args) {
		
		//HashMap<String, Integer> hm = new HashMap<String, Integer>();
		ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<String, Integer>();
		hm.put("jashu", 92);
		
		System.out.println("elements of map" +hm);
		
		for(Integer val:hm.values()){
			System.out.println(val);
			hm.computeIfAbsent("jashuuu", a->99);
		}
		hm.computeIfAbsent("bh", a->100);
		hm.computeIfAbsent("regatte", a->100);
		System.out.println(hm.containsValue(100));
		System.out.println(hm.containsKey("jashu"));
		
		System.out.println("elements of map" +hm);
		
		

	}

}
