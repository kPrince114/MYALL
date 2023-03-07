package com.Question4;

public class Fibonacci extends Thread {
	int f=0;
	int s=1;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				int s1=f+s;
				f=s;
				s=s1;
				System.out.println(s1);
			}
			this.notify();

		}
				
		
	}
	

}
// 0,1,1,2,3,5,8,13