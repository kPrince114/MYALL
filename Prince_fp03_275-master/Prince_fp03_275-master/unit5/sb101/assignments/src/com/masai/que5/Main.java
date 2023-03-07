package com.masai.que5;

public class Main {

	public static void main(String[] args) {
		
		Aclass aclass = new Aclass();		
		Bclass bclass = new Bclass();
		
		Thread thread1 = new Thread(aclass);
		
		Thread thread2 = new Thread(bclass);
		
		thread1.start();
		thread2.start();

		System.out.println("This Main thread has been Ended. ");
	}
	
}
