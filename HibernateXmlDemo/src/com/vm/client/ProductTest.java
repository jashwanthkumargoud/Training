package com.vm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.vm.entity.Product;

public class ProductTest {

	public static void main(String[] args) 
	{
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
   		Transaction t = session.beginTransaction();  
		
				
				
				Product pro = new Product();
				
				pro.setName("one");
				pro.setCategory("mobile");
				pro.setPrice(40000);
					
				session.save(pro);
				t.commit();
				factory.close();
				session.close();

			}
}

