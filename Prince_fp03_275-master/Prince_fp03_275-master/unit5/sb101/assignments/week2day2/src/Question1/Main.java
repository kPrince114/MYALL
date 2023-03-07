package Question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA tA= new ThreadA();
		ThreadB tB= new ThreadB();
		
		Thread t1 = new Thread(tA);
		Thread t2 = new Thread(tB);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.setPriority(5);
		t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		
	}

}
