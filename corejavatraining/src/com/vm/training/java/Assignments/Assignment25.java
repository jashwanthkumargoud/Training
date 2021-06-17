package com.vm.training.java.Assignments;
import java.util.Scanner;
interface AdvancedArithmetic {
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
	@Override
	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("I implemented: Advanced Arithematic ");
		return sum;
	}
}
public class Assignment25{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		MyCalculator mymalculator = new MyCalculator();
		System.out.println(mymalculator.divisor_sum(n));
	}
}
