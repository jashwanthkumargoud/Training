package com.vm.interfaceexample;

public interface Electricshop {
	
	public void switches();
	public void bulb();
	public void tubelight();
	public void fans();
	default void cooler() {
		
	}

}
