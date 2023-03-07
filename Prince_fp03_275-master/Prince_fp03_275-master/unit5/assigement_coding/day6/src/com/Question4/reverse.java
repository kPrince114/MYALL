package com.Question4;

public class reverse extends Thread {
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=10;i>0;i--) {
				System.out.println(i);
			}
			this.notify();
			
		}
		
		
	}
	

}
