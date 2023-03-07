package com.Question4;

public class main1 {

	public static void main(String[] args) throws InterruptedException {
		Fibonacci f1=new Fibonacci();
		reverse s1=new reverse();
		f1.start();
		
		synchronized (f1) {
			f1.wait();
		}
		s1.start();
		synchronized (s1) {
			s1.wait();
		}


	}

}
