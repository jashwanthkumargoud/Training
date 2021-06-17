package com.vm.interfaceexample;

public class Manager {

	public static void main(String[] args) {
		
		Hawells hawells = new Hawells();
		
		Bajaj bajaj = new Bajaj();
		
		Electricshop es = new Hawells();
		
		hawells.bulb();
		hawells.fans();
		hawells.switches();
		hawells.tubelight();
		bajaj.bulb();
		bajaj.fans();
		bajaj.switches();
		bajaj.tubelight();
		
		es.bulb();
		
		bajaj.cooler();
		

	}

}
