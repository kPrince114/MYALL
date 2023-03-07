package com.Question2;

import java.util.Scanner;

public class addMian {
	public static void main(String[] args) throws ProductError {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int Productid=sc.nextInt();
		System.out.println("Enter proname");
		String name=sc.next();
		System.out.println("Enter price");
		int price =sc.nextInt();
		System.out.println("Enter Quantity");
		int quantity = sc.nextInt();
		implementsAll a1=new implementsAll();
		Product p=new Product(Productid, name, price, quantity);
		String s=a1.addProduct(p);
		System.out.println(s);
	}
}
