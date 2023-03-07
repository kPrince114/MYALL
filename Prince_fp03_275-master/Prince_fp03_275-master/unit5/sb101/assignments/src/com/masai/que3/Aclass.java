package com.masai.que3;

public class Aclass implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running ");
		}
	}

}
