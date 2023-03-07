package com.Question3;

public class produ extends Thread{
	
	first fi;
	
	public produ(first fi) {
		this.fi=fi;
	}
	
	
	@Override
	public void run() {
	
		int i=0;
		//int sum=0;
		while(true) {
			
			
			i= i+1;
            //sum=sum+i;	
			fi.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	

}
