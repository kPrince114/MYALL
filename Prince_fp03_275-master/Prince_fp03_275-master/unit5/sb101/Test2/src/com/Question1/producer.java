package com.Question1;
public class producer extends Thread{
	
	first fi;
	
	public producer(first fi) {
		this.fi=fi;
	}
	
	
	@Override
	public void run() {
	
		int i=0;
		int sum=0;
		while(true) {
            sum=sum+i;	
			fi.produce(sum,i);
			i= i+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	

}