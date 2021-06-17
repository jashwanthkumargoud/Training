package com.vm.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.client.Restaurant;

public class RestaurantClient {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Restaurant restaurant =(Restaurant)factory.getBean("r1");
		restaurant.displayrestaurant();
	}
}