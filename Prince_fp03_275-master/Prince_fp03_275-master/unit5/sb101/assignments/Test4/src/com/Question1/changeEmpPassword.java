package com.Question1;

import java.util.Scanner;

public class changeEmpPassword {
	public static void main(String[] args) {
		implementsAll a1=new implementsAll();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter password");
		int password=sc.nextInt();
		String res=a1.updateEmpolyPassword(id, password);
		System.out.println(res);
	}
}
