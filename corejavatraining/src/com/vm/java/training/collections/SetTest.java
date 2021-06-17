package com.vm.java.training.collections;
import java.util.*;

class Emp{
	int id;
	String name;
	String Dept;
	
}

class EmpDetails extends Emp{
	String address;
	String pancard;
	public EmpDetails(int id, String name, String Dept,String address, String pancard) {
		super( );
		this.address = address;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "EmpDetails [address=" + address + ", pancard=" + pancard + "]";
	}
	
	
}
public class SetTest {

	public static void main(String[] args) {
		
		HashMap ts = new HashMap<>();
		ts.put(100, "jashu");
		

	}

}
