package com.vm.java.training.exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WWEWrelster {
public static void main(String[] args) {
	List<WWE> wrestlers = new ArrayList<WWE>(); 
	wrestlers.add(new WWE("Jashwanth","kumar", 60));
	wrestlers.add(new WWE("jaideep", "chow", 70));
	wrestlers.add(new WWE("rahul", "anku", 75));
	wrestlers.add(new WWE("yuva", "teja", 80));
	wrestlers.add(new WWE("amith", "nalmas", 101));
	long c = wrestlers.stream().count();
	System.out.println("Number of wrestlers :"+c);
	long  wrestlerssum = wrestlers.stream().filter(p->p.getWeight()>75).map(p->p.getWeight()).reduce(0,(A,B)->A+B);
	 System.out.println("sum of wrestlers weight > 75 : "+wrestlerssum);
	 System.out.println("FirstName of all wrestlers : ");
	 printFirstName(wrestlers).forEach(p->System.out.println(p));
	 System.out.println("sorted names of wrestelers:");
	 sortbyFirstName(wrestlers).forEach(p->System.out.println(p));
 
}
private static List<String> printFirstName(List <WWE> list)
{
	 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
	
}
private static List<WWE> sortbyFirstName(List <WWE> list)
{
	 return list.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
	
}
}