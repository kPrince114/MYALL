package com.Question1;

import java.util.Scanner;

public class updatedept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter did");
		int id=sc.nextInt();
		System.out.println("Enter update location");
		String loc=sc.next();
		implementsAll a1=new implementsAll();
		String s=a1.updatedept(loc, id);
		System.out.println(s);
	}

}
