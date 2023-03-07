package com.masai.que1;

public class Hritik extends Thread {

	@Override
	public void run() {

		int product = 1;

		for (int i = 1; i <= 10; i++) {

			product *= i;
			
			System.out.println("This is Hritik Thread : " + product);
		}

	}

}
