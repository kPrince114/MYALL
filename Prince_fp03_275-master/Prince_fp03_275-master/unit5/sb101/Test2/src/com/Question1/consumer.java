package com.Question1;

public class consumer extends Thread{
	
	first fi;
	
	public consumer(first fi) {
		this.fi=fi;
	}
	
	@Override
	public void run() {
	
		while(true) {
			
			// int i= fi.consume();
			 int sum=fi.consume();
			System.out.println("Consumer Calculated Sum is: "+sum);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}