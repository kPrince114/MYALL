package com.Question1;

public class main1 {
public static void main(String[] args) {
		
		first c= new first();
		
		producer pr = new producer(c);
		
		consumer cr= new consumer(c);
		cr.start();
		pr.start();
		
			
	}
}
