package com.vm.java.training.interthreadcommunication;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue<Integer> Commonqueue;
	
	
	public Producer(BlockingQueue<Integer> commonqueue) {
		super();
		this.Commonqueue = commonqueue;
	}


	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("PRODUCER :");
			Commonqueue.add(i);
			System.out.println("Element add"+i);
			System.out.println("Queue elements are "+Commonqueue);
			System.out.println("===================");
		}
		
	}

}