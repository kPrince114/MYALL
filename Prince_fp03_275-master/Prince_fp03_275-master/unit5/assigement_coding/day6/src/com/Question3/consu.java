package com.Question3;

public class consu extends Thread{
	
	first fi;
	
	public consu(first fi) {
		this.fi=fi;
	}
	
	@Override
	public void run() {
	
		while(true) {
			
			 int i= fi.consume();
			// int sum=fi.consume();
			System.out.println("Consumer consume :"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}