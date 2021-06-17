package com.vm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vm.service.DatabaseService;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.vm");
		context.refresh();
		
		DatabaseService databaseService =(DatabaseService)context.getBean("databaseService");
		databaseService.displayDBInfo();
		

	}

}
