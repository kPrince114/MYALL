package com.Question1;


public class first {
int value;

boolean flag = true;

public synchronized void produce(int sum,int i) {
	
	if(flag == true) {
	
	value= i;
    value = sum;
	System.out.println("Producer produces :"+i);
	flag = false;
	this.notify();
	
	try {
		this.wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}

public synchronized int consume() {

	if(flag == true) {
		
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	flag = true;
	this.notify();
	

	return value;


}
}
