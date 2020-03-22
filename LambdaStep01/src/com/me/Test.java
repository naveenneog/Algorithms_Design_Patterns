package com.me;

public class Test {
	
	
	public static void main(String[] args){
		At a = new At(){
			
			public void run() {
				System.out.println("...");
				synchronized (this) {
					count++;
					notify();
				}
				
			}
		};
		a.start();
		synchronized(a)
		{
			System.out.println("waiting");
			try {
				a.wait();
				System.out.println("as");
			} catch (InterruptedException e) {
			}
			System.out.println("before");
			System.out.println(a.count);
			System.out.println("after");
		}

	}
}

class At extends Thread{
	int count = 0;
	
	public void run(){
		System.out.println("run");
		synchronized(this){
			for(int i=0;i<50;i++){
				count = count+i;
			}
			notify();
		}
	}
}

