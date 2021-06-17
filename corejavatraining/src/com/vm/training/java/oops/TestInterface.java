package com.vm.training.java.oops;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVehicle b = new Bus();
		IVehicle t = new Truck();
		Car c = new BMW(null);
		b.Steering();
		t.Steering();
		c.ac();
		c.accelarator();
		c.Brakes();
		c.clutches();
		c.gears();
		c.Steering();
		
		IVehicle b1 = new BMW(null);
		b1.accelarator();
		b1.Brakes();
		b1.clutches();
		b1.gears();
		b1.Steering();
		
	}

}
