package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Product;

public class ProductRetrive {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.hbm.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Product o=null;
		try {
			
		o= session.load(Product.class, new Integer(10));
		Transaction tx = session.beginTransaction();
		
		o.setPrice(5400);
		
		tx.commit();
		}catch (Exception e) {
			
		}
		
		

	}

}
