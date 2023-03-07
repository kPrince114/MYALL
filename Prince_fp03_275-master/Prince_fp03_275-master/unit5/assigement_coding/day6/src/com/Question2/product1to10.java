package com.Question2;

public class product1to10 extends Thread {
	int product=1;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				product*=i;
			}
			this.notify();
		}
		
		
	}
}
