package Question3;

public class virak extends Thread{
	
	int sum = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for(int i=1;i<=20;i++) {
				sum=sum+i;
			}
			System.out.println("Virat thread :"+sum);
		}
	}
}
