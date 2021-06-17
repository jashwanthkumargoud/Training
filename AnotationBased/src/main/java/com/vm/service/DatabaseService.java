package com.vm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.vm.dao.IDao;

@Component
public class DatabaseService {
	
	@Autowired
	@Qualifier("mySql")
	IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	public void displayDBInfo() {
		
		dao.dataBaseName();
	}

}
