package com.vm.client;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Restaurant {
	
	String name;
	IHotDrink iHotDrink;
	List Employees;
	Set Menus;
	

	public void setName(String name) {
		this.name = name;
	}



	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}
	
	



	public void setEmployees(List employees) {
		Employees = employees;
	}



	public void setMenus(Set menus) {
		Menus = menus;
	}



	public void displayrestaurant() {
		System.out.println("XYZ Restaurant");
		iHotDrink.prepare();
		System.out.println(" " +Employees);
		System.out.println(" " +Menus);
		
	}
	
	
		
}

