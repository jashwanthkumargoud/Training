package com.vm.cafeteria;

public class Cafeteria {
	
	private int item_Id;
	private String item_Name;
	private int item_Price;
	
	public Cafeteria(int item_Id, String item_Name, int item_Price) {
		super();
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Price = item_Price;
	}

	public int getItem_Id() {
		return item_Id;
	}

	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}

	public String getItem_Name() {
		return item_Name;
	}

	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}

	public int getItem_Price() {
		return item_Price;
	}

	public void setItem_Price(int item_Price) {
		this.item_Price = item_Price;
	}

	@Override
	public String toString() {
		return "Cafeteria [item_Id=" + item_Id + ", item_Name=" + item_Name + ", item_Price=" + item_Price + "]";
	}
	

}
