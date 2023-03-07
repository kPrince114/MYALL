package com.Question2;

import java.util.Scanner;

public class DeleteFromFirstCar {
	public static void main(String[] args) throws ProductError {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String firstcharname=sc.next();
		implementsAll a1=new implementsAll();
		String s=a1.deleteProductByFirstCharName(firstcharname);
		System.out.println(s);
	}
}
