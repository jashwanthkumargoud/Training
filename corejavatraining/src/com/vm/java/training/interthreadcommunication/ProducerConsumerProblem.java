package com.vm.java.training.interthreadcommunication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		Producer producer=new Producer(bq);
		Consumer consumer=new Consumer(bq);
		
		Thread producerthreasd=new Thread(producer);
		Thread consumerthreasd=new Thread(consumer);
		
		
		
	}

}