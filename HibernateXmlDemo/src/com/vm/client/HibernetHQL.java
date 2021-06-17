package com.vm.client;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Product;

public class HibernetHQL {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = con.buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		Query qry = session.createQuery("from Product p");
		
		List l = qry.list();
		System.out.println("total no of records :" +l.size());
		Iterator it = l.iterator();
		
		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Product p = (Product)o;
			System.out.println("product id" +p.getId());
			System.out.println("protoct name: " +p.getName());
			System.out.println("product category" +p.getCategory());
			
		}
		
		l.forEach(System.out::println);
		
		System.out.println("query with conditions");
		Query<Product> que2 = session.createQuery("select product from Product product where product.price< 50000");
		List<Product> list = que2.list();
		list.forEach(System.out::println);
		
		
		Query<Product> q1 = session.createQuery("select product from Product product where price > ?");
		

	}

}
