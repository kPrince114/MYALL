package Question3;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhoni dhoni = new Dhoni();
		rohit rohit = new rohit();
		virak virat = new virak();
		
		dhoni.setPriority(10);
		rohit.setPriority(9);
		
		dhoni.start();
		rohit.start();
		virat.start();
		
	}

}