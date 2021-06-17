package com.vm.entity;

public class College {
	
	private String name;
	private String college_dept;
	
	private Department department;
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCollege_dept(String college_dept) {
		this.college_dept = college_dept;
	}
	public void displaycollegeinfo() {
		System.out.println(""+name);
		System.out.println(""+college_dept);
		department.display();
	}

}
