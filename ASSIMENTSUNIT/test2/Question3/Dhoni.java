package Question3;

public class Dhoni extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println("Dhoni thread :"+i);
			}
		}
	}
}
