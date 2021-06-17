package com.vm.entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class Create
{
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt)
	{
		this.jt = jt;
	}

	public void createTable()
	{
		jt.execute("create table JdbcTable(sno int, name varchar(10))");
		System.out.println("table created");
	}
}