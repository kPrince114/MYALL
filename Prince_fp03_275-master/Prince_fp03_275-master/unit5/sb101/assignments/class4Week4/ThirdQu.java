package class4Week4;

import java.util.Scanner;

public class ThirdQu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter update Your roll");
		int roll=sc.nextInt();
		System.out.println("Enter update Your mark");
		int marks=sc.nextInt();
		System.out.println("Enter Your name");
		String name=sc.next();
		implement1 s=new implement1();
		String st=s.ThirdQ(roll,marks,name);
		System.out.println(st);

	}

}
