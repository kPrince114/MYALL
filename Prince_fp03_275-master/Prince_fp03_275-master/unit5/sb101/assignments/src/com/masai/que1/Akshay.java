package com.masai.que1;

public class Akshay extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(Thread.currentThread().getName() + " is Running ");

		}

	}

	public static void main(String[] args) {

		Salman salman = new Salman();

		Hritik hritik = new Hritik();

		Akshay akshay = new Akshay();

		Thread salmanThead = new Thread(salman);

		Thread hritikThread = new Thread(hritik);

		Thread akshayThread = new Thread(akshay);
		
		
		akshayThread.setName("Akashy");
		
		salmanThead.start();
		hritikThread.start();
		akshayThread.start();
	}

}
