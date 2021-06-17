package com.vm.training.java.oops;

public class EmployeePersonalDetails extends EmployeeDetails {
	
	String nationality;
	
	

	public EmployeePersonalDetails(int id, String name, String dept, String email, String mobile, String address, String nationality) {
		super(id, name, dept, email, mobile, address);
		this.nationality = nationality;
		
		
	}
	
	
	@Override
	public String toString() {
		return "EmployeePersonalDetails [nationality=" + nationality + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + ", id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}





	public static void main(String[] args) {
		
		EmployeePersonalDetails epd = new EmployeePersonalDetails(100,"abc","IT","a@b.com","12345","MBNR","Indian");
		
		System.out.println(epd);
		

	}

}
