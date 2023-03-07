package Quetion2;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
	}

}
