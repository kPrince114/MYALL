package com.masai.que2;

public class Main {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(A::funA);
		Thread thread2 = new Thread(new A()::funB);
		
		thread1.setName("Dhoni");
		thread2.setName("Kohli");
		
		thread1.start();
		thread2.start();
		
		
	
		
		
		
	}
	
}
