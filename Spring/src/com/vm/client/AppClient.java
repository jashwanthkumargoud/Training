package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.College;
import com.vm.entity.Department;
import com.vm.entity.Employee;
import com.vm.entity.Product;

public class AppClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Applicationcontext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee)factory.getBean("emp");
		employee.displayEmployeeInfo();
		
		System.out.println("----product details----");
		Product product =(Product)factory.getBean("p");
		System.out.println(product);
		
		Department d1 =(Department)factory.getBean("d");
		System.out.println(d1);
		
		College clg =(College)factory.getBean("clg");
		System.out.println(clg);
		
		

	}

}
