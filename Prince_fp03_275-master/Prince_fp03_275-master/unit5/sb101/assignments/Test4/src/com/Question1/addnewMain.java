package com.Question1;

import java.util.Scanner;

public class addnewMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		implementsAll a1=new implementsAll();
		String name=sc.nextLine();
		String location=sc.nextLine();
		String str=a1.addNewDept( name, location);
		System.out.println(str);
	}
}
