package com.masai.que4;

public class Main {

	public static void main(String[] args) {
		
		Aclass aclass = new Aclass();
		Bclass bclass = new Bclass();
		Cclass cclass = new Cclass();
		
		aclass.start();
		bclass.start();
		cclass.start();
		
		System.out.println("The Main Thread has been ended.");
	}
	
}
