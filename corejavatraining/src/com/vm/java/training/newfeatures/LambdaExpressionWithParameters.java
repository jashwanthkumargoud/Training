package com.vm.java.training.newfeatures;

@FunctionalInterface
interface Param{
	void add(int  a , int b );
}

interface Param2{
	int multiply(int a , int b ) ;
	
}
interface Large
{
	int find(int a, int b , int c);
}
interface Str
{
	void enter(String s);
}

interface Rev{
	void rev(String s1);
}

public class LambdaExpressionWithParameters {

	public static void main(String[] args) {
		
		Param p =(a,b)->System.out.println("add " +(a+b));
		p.add(2,4);
		
		Param2 p2 = (a,b)->a*b;
		System.out.println("multiply is" +p2.multiply(2,4));
		
		Str s1 =(s)->System.out.println(" length of String "+s.length());
		
		s1.enter("jashwanth");
		Rev rev  =(s1)->
		{
			StringBuilder s4 = new StringBuilder(s1);
			s1=s4.reverse().toString();
			
		};
	
		Large l = (a,b,c)->
		{
			if(a>b)
				return a;
			else if (b>a && b>c)
				return b;
			else
				return c;
		};
		
		System.out.println("Largest number is " +l.find(3, 6, 4));
		
		
		

	}

}
