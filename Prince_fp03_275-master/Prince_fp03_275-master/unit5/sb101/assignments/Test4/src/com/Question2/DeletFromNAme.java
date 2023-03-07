package com.Question2;

import java.util.Scanner;

public class DeletFromNAme {
	public static void main(String[] args) throws ProductError {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.next();
		implementsAll a1=new implementsAll();
		String s=a1.deleteProductByName(name);
		System.out.println(s);
	}

}
