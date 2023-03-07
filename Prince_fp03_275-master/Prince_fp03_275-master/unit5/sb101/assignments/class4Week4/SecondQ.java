package class4Week4;

import java.util.Scanner;

public class SecondQ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println(" Your mark is already their ");
			System.out.println("Enter Your address");
			String address=sc.next();
			System.out.println("Enter Your name");
			String name=sc.next();
			System.out.println("Enter Your roll");
			int roll=sc.nextInt();
			implement1 s=new implement1();
			String st=s.QuestionTwo(roll,name, address);
			System.out.println(st);

	}
}
