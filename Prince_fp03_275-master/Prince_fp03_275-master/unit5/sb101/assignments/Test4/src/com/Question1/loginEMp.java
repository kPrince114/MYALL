package com.Question1;

import java.util.Scanner;

public class loginEMp {
	public static void main(String[] args) {
		implementsAll a1=new implementsAll();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter email");
		String email=sc.next();
		String res=a1.loginEmp(id, email);
		System.out.println(res);
	}
}
