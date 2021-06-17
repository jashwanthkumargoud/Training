package com.vm.training.java.oops;

public abstract class Car implements IVehicle {
	
	String model;
	Car(String model){
		this.model = model;
	}
	

	@Override
	public void Steering() {
		System.out.println("power sterring");
		
	}

	@Override
	public void Brakes() {
		System.out.println("disk breaks");
		
	}

	@Override
	public void accelarator() {
		System.out.println("no idea");
		
	}

	@Override
	public void clutches() {
		System.out.println("gears");
		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	
	abstract void ac();
	abstract void indicator();
	

}
