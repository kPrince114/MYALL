package class4Week4;

import java.util.Scanner;

import commanFun.impl2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Your roll");
			int roll=sc.nextInt();
			System.out.println("Enter Your address");
			String address=sc.next();
			System.out.println("Enter Your name");
			String name=sc.next();
			System.out.println("Enter Your Age");
			int marks=sc.nextInt();
			implement1 s=new implement1();
			String st=s.Student(roll, name, address, marks);
			System.out.println(st+"  >:- "+ i+ " th Student");
		}
		
		
	}

}
