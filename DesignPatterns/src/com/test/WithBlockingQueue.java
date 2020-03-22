package com.test;

import java.util.concurrent.ArrayBlockingQueue;

import com.queue.BlockingQueue;


public class WithBlockingQueue {
	
	public static void main(String[] args) {
		BlockingQueue queue = new BlockingQueue(10);
		final Runnable producer = () ->{
			for(int j =0 ;j <10 ;j ++){
				try {
					((BlockingQueue) queue).put(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
//		new Thread(producer).start();
		new Thread(producer).start();
		final Runnable consumer = () -> {
			while(true){
				Integer i;
				try {
					i = (Integer) queue.take();
					System.out.println("P :"+i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(consumer).start();
		new Thread(consumer).start();
		new Thread(consumer).start();
		
		
	}

}
