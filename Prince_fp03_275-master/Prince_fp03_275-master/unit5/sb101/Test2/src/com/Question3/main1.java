package com.Question3;
class Dhoni extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() +" is running : " + i);
		}
	}
}
class Virat extends Thread{
	int sum=0;
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		System.out.println(Thread.currentThread().getName() +" : " +sum);
		
	}
}
class Rohit extends Thread{
	int pro=1;
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			pro*=i;
		}
		System.out.println(Thread.currentThread().getName() +" : " +pro);
	}
}


public class main1 {
	public static void main(String[] args) throws InterruptedException {
		Dhoni dh=new Dhoni();
		Virat vh=new Virat();
		Rohit rh=new Rohit();
		dh.setName("Dhoni");
		vh.setName("Virat");
		rh.setName("Rohit");
		dh.setPriority(10);
		dh.start();
		dh.join();
		rh.start();
		rh.join();
		vh.start();
		
	}

}










