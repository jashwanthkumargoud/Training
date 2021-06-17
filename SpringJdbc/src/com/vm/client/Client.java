package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Create;

public class Client {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("Object.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Create create =(Create)factory.getBean("id3");
		create.createTable();
		
		

	}

}
