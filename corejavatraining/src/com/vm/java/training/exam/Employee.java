package com.vm.java.training.exam;


public class Employee {

	private String firstName;
	private String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void validation() throws Exception
	{
		if(this.firstName != null && this.lastName!=null)
		{
			if(this.firstName.length()<3&& this.lastName.length()<3)
				throw new MinimumCharacterException("you should not enter less than 3 characters");
			
		}
		else
		{
			throw new NullPointerException("you have not entered");
		}
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
