package Quetion3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salman s1 = new Salman();
		Hritik h1 = new Hritik();
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(h1);
		
		t1.setName("Salman");
		t2.setName("Hritik");
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		t1.start();
	}

}
