package com.vm.java.training.newfeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class InBuildFunction {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (var1)-> var1>2;
		System.out.println(p.test(3));
		
		Predicate<String> p1 = (v1)-> v1.contains("a");
		System.out.println(p1.test("jashu"));
		
		Function<String, String> f1 = (f2)-> f2.concat("hello welcome");
		f1.apply("Sachin");
		System.out.println(f1.apply("sachin"));

	}

}
