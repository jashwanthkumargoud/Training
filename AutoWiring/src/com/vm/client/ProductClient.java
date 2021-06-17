package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Address;
import com.vm.entity.Customer;
import com.vm.entity.Order;

public class ProductClient {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Customer customer1 = (Customer)factory.getBean("customer");
		customer1.displayCustomerInfo();
		
		
		
	}
}