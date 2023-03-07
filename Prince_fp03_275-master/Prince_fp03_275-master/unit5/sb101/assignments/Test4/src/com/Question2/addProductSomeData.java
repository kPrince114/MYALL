package com.Question2;

import java.util.Scanner;

public class addProductSomeData {
	public static void main(String[] args) throws ProductError {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int Productid = sc.nextInt();
		System.out.println("Enter Quantity");
		int q = sc.nextInt();
		implementsAll a1=new implementsAll();
		String s=a1.addProSomeData(Productid, q);
		System.out.println(s);
	}
}
