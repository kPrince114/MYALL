package com.Question1;

import java.util.Scanner;

public class addEmpWithDid {
	public static void main(String[] args) {
		implementsAll a1=new implementsAll();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter address");
		String address=sc.nextLine();
		System.out.println("enter emial");
		String emial=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		String res=a1.addWithDepID(name, address, emial, password, salary);
		System.out.println(res);
		
		
		
		
	}
}
