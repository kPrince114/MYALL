package com.masai.que3;

public class Main {

	public static void main(String[] args) {
		Aclass t1 = new Aclass();
		Bclass t2 = new Bclass();
		
		Thread threadA = new Thread(t1);
		
		Thread threadB = new Thread(t2);
		
		threadA.setName("A - class");
		threadB.setName("B - class");
		
		threadA.start();
		threadB.start();
		
	}
	
}
