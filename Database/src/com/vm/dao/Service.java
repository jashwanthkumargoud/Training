package com.vm.dao;

public class Service {
	
	Idao dao;

	public void setDao(Idao dao) {
		this.dao = dao;
	}
	
	public void displaydatabase() {
		dao.databaseName();
	}

}
