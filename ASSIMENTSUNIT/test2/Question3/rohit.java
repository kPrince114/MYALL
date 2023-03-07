package Question3;

public class rohit extends Thread{
	
	int pro = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			pro=pro*i;
		}
		System.out.println("Rohit thread :"+pro);
	}
}