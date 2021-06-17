package com.vm.java.Assignment.Collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class States {
public static void main(String[] args) throws Exception {
	File f = new File("C:\\Users\\User\\OneDrive - K L University\\Desktop\\PRATHIMA/states.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	Set<String> states = new LinkedHashSet<String>();
	String line = br.readLine();
	while(line!=null)
	{
		states.add(line);
		line=br.readLine();
	}
	System.out.println("Total no of States: "+states.size());
	System.out.println(states);
	states.remove("Telangana");
	System.out.println("States after removing Telangana: ");
	System.out.println(states);
	System.out.println("States starting with K: ");
	for(String i:states) {
		if(i.startsWith("K"))
			System.out.print(i+" ");
	}
	SortedSet<String> sortedStaes = new TreeSet<String>(states); 
	System.out.println("\nStates after Sorting: ");
	System.out.println(sortedStaes);
	
}
}
