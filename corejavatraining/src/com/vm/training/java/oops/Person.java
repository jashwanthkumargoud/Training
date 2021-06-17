/**
 * 
 */
package com.vm.training.java.oops;

/**
 * @author User
 *
 */
public class Person {

	int id;
	String name;
	String Address;
	
	Person()
	{
		Address a1 = new Address();
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	
}
