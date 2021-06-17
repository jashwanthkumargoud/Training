package com.vm.project.java.caffeteria;

import java.util.*;
public class Cafe {
	private static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		VendingMachine vm;
		String[] temp;
		@SuppressWarnings("unused")
		int a;
		String items="";
		String prices="";
		String quantities="";
		System.out.println("--------------VM Caffetteria--------------");
		boolean repeat = true;
		while(repeat){
			int choice = printMenu();
			switch(choice){
			case 1: 
				vm= new Coffee();
				a=10;
				temp = vm.make(SelectQuantity()).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				quantities=quantities+temp[2]+"/";
			break;
			case 2: 
				vm= new Espresso();
				temp = vm.make(SelectQuantity()).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				quantities=quantities+temp[2]+"/";
				break;
			case 3: 
				vm= new WhiteCoffee();
				temp = vm.make(SelectQuantity()).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				quantities=quantities+temp[2]+"/";
				break;
			case 4: 
				vm= new Cappucchino();
				temp = vm.make(SelectQuantity()).split(",");
				items=items+temp[0]+"/";
				prices=prices+temp[1]+"/";
				quantities=quantities+temp[2]+"/";
				break;
			default:repeat = false;
		            Bill bill = new Bill(items, prices, quantities);
		            bill.generate();
				
				break;
			}
		}
		}
	private static int printMenu(){
		System.out.println("------------------------------------------");
		System.out.println("1. Coffee");
		System.out.println("2. Espresso");
		System.out.println("3. White Coffee with Milk");
		System.out.println("4. Cappucchino");
		System.out.println("0. Bill");
		System.out.println("------------------------------------------");
		return s.nextInt();
	}
	private static int SelectQuantity(){
		int q;
		System.out.print("Select Quantity: ");
		q=s.nextInt();
		return q;
	}

		
		
		
	
	}

