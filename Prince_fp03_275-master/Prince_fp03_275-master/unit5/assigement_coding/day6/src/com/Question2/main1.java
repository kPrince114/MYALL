package com.Question2;

public class main1 {

	public static void main(String[] args) {
		product1to10 t1=new product1to10();
		t1.start();
		synchronized (t1) {
			
			try {
				t1.wait();
				System.out.println(t1.product);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		

	}

}
