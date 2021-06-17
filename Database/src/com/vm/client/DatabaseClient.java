package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.dao.Service;

public class DatabaseClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Service service =(Service)factory.getBean("s1");
		service.displaydatabase();

	}

}
