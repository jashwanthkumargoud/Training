package com.vm.java.training.interthreadcommunication;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Integer> Commonqueue;

	public Consumer(BlockingQueue<Integer> commonqueue) {
		super();
		this.Commonqueue = commonqueue;
	}
	
	public void run()
	{
		while (true) {
			try {
				System.out.println("Consumer is tacking "+Commonqueue.take());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}