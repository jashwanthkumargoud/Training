package com.vm.project.java.caffeteria;

import java.util.Scanner;

public class Bill {
	private String items;
	private String prices;
	private String quantities;
	
	String[] coupons = new String[] {"FLAT30","VM20"};
	int[] coupondiscount = new int[] {30,20};
	public Bill(String items,String prices ,String quantities)
	{
		this.items=items;
		this.prices=prices;
		this.quantities=quantities;
		
	}
	public void generate()
	
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------Order-Preview--------------");
	   double tot= printbill();
		System.out.println("Total         "+tot+"/-");
		System.out.println("------------------------------");
		System.out.println("Have Coupon Code Y/N");
		String c = sc.next();
		if(c.equalsIgnoreCase("Y"))
		{
			System.out.print("Apply Coupon Code: ");
			String code = sc.next();
			int discount=0;
			for (int i=0;i<coupons.length;i++) {
			    if (coupons[i].equals(code)) {
			        discount = coupondiscount[i];
			        break;
			    }
		}
			System.out.println("-------------Bill--------------");
			printbill();
			System.out.println("Discount         "+discount+"/-");
			System.out.println("Total         "+(tot-discount)+"/-");
			System.out.println("------------------------------");
			System.out.println("Thanks for visiting......!");
	}
		else
		{
			System.out.println("-------------Bill--------------");
			printbill();
			System.out.println("Total         "+tot+"/-");
			System.out.println("------------------------------");
			System.out.println("Thanks for visiting......!");
		}

	
}
	public double printbill()
	{
		 double total=0.0;
		   String[] it = items.split("/");
		     String[] pri = prices.split("/");
		     String[] qua = quantities.split("/");
			for(int i=0;i<it.length;i++)
			{
				total=total+Double.parseDouble(pri[i]);
				System.out.println(it[i]+"   "+qua[i]+"    "+pri[i]+"/-");
			}
			return total;
		
	}
}
