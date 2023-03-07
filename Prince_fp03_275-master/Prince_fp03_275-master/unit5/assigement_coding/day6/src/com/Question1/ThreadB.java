package com.Question1;

public class ThreadB extends Thread  {

	@Override
	public void run() {
		synchronized (ThreadB.class) {
			for(int i=1; i<=10;i++){

				System.out.println(Thread.currentThread().getName()+"is running "+i);

				}
		}
		
		
	}

}
