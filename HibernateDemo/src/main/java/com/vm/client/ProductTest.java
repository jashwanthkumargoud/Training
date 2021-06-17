package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Product;



public class ProductTest {

	public static void main(String[] args) {
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Product pro = new Product();
		
		pro.setProduct_Name("one ");
		pro.setCategory("mobile");
		pro.setPrice(5900);
		
		
		session.save(pro);
		transaction.commit();

	}

}
