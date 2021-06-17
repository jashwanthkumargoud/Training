package com.vm.training.java.oops;

public class EmployeeDetails extends Employee {
	
	String email;
	String mobile;
	String address;
	
	public EmployeeDetails(int id,String name, String dept, String email, String mobile,String address) {
		super(id,name,dept);
		this.email = email;
		this.mobile=mobile;
		this.address = address;
	}
	
	public String toString() {
		
		return id+"\t" +name+"\t"+dept+"\t"+email+"\t\t"+mobile+"\t"+address;
	}
	

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails(100,"abc","IT","a@b.com","12345","MBNR");
		System.out.println(ed);
		

	}

}
