package Quetion2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadA tA = new ThreadA();
		ThreadB tB = new ThreadB();
		
		Thread t1 = new Thread(tA);
		Thread t2 = new Thread(tB);
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
	}

}
