package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vm.entity.Employee;

public class App {

	public static void main(String[] args) {
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setName("jai");
		emp.setDept("Dev");
		
		session.save(emp);
		transaction.commit();
		
		
	}

}
