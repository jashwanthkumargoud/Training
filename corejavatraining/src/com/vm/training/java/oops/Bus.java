package com.vm.training.java.oops;

public class Bus implements IVehicle{

	

	@Override
	public void Steering() {
		System.out.println("dosa");
		
	}

	@Override
	public void Brakes() {
		System.out.println("powerfull");
		
	}

	@Override
	public void accelarator() {
		System.out.println("fast");
		
	}

	@Override
	public void clutches() {
		System.out.println("Slow");
		
	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 6;
	}

}
