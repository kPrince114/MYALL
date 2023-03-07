package com.masai.que1;

public class Salman extends Thread {

	@Override
	public void run() {
		int sum = 0;

		for (int i = 0; i < 10; i++) {

			sum += i;

			System.out.println("This is salman thread : " + sum);
		}

	}

}
