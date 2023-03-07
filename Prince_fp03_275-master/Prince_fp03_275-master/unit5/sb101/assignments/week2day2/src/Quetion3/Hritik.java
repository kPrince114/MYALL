package Quetion3;

public class Hritik implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}

}
