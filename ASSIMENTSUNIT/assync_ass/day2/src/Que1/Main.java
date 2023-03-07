package Que1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//Using Method Reference
		Demo d1 = Integer::parseInt;
		int x = d1.convetStringToNumber("79");
		System.out.println(x);
		
		//using external class
		Demo d2 = new DemoImpl();
		int y = d1.convetStringToNumber("10");
		System.out.println(y);
		
		// using LE
		Demo d3 = s -> Integer.parseInt(s);
		int z = d3.convetStringToNumber("20");
		System.out.println(z);
		
	}

}
