package com.Question3;

public class demo {
	
	public static void main(String[] args) {
		
		first c= new first();
		
		produ pr = new produ(c);
		
		consu cr= new consu(c);
		cr.start();
		pr.start();
		
			
	}
}