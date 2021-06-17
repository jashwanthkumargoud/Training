package com.vm.java.training.Assignment3;

import java.util.ArrayList;

public class ProductList {
		ArrayList<Product>products = new ArrayList<Product>();

		public ArrayList<Product> wareHouse()
		{
			Product[] product = new Product[12];
			for(int i=0;i<12;i++)
			{
				product[i]= new Product();
			}
			
			product[0].setPid(1);product[0].setCategory("Electronics");product[0].setPname("Samsung Galaxy S21 Ultra");product[0].setPrice(60000.0);product[0].setQuantity(10);
			product[1].setPid(2);product[1].setCategory("Clothes");product[1].setPname("Levis");product[1].setPrice(1500.0);product[1].setQuantity(50);
			product[2].setPid(3);product[2].setCategory("Clothes");product[2].setPname("Allen Solly");product[2].setPrice(2500.0);product[2].setQuantity(40);
			product[3].setPid(4);product[3].setCategory("Toys");product[3].setPname("Rubiks cube");product[3].setPrice(100.0);product[3].setQuantity(15);
			product[4].setPid(5);product[4].setCategory("Furniture");product[4].setPname("Ikea products");product[4].setPrice(10000.0);product[4].setQuantity(10);
			product[5].setPid(6);product[5].setCategory("HouseHold");product[5].setPname(" Soap ");product[5].setPrice(25.0);product[5].setQuantity(30);
			product[6].setPid(7);product[6].setCategory("Electronics");product[6].setPname("Lenovo");product[6].setPrice(70000.0);product[6].setQuantity(10);
			product[7].setPid(8);product[7].setCategory("Clothes");product[7].setPname("Calvin Klein ");product[7].setPrice(600.0);product[7].setQuantity(50);
			product[8].setPid(9);product[8].setCategory("Toys");product[8].setPname(" Mask ");product[8].setPrice(500.0);product[8].setQuantity(100);
			product[9].setPid(10);product[9].setCategory("Furniture");product[9].setPname(" Chair");product[9].setPrice(15000.0);product[9].setQuantity(15);
			product[10].setPid(11);product[10].setCategory("Electronics");product[10].setPname(" Camera ");product[10].setPrice(60000.0);product[10].setQuantity(5);
			product[11].setPid(12);product[11].setCategory("Electronics");product[11].setPname(" Televison ");product[11].setPrice(50000.0);product[11].setQuantity(10);
			
			for(int i=0;i<12;i++)
			{
				products.add(product[i]);
			}
			return products;
		}
	}

