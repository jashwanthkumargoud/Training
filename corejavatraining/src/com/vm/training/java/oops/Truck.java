package com.vm.training.java.oops;

public class Truck implements IVehicle {


	@Override
	public void Steering() {
		System.out.println("powerful sterring");
		
	}

	@Override
	public void Brakes() {
		System.out.println("power");
		
	}

	@Override
	public void accelarator() {
		System.out.println("Medium");
		
	}

	@Override
	public void clutches() {
		System.out.println("Gear");
		
	}

	@Override
	public int gears() {
		
		return 6;
	}

}
