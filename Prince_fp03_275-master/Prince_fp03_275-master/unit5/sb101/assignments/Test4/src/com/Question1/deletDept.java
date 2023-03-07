package com.Question1;

import java.util.Scanner;

public class deletDept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter depid");
		int id=sc.nextInt();
		implementsAll a1=new implementsAll();
		String s=a1.DeleteDept(id);
		System.out.println(s);
	}

}
