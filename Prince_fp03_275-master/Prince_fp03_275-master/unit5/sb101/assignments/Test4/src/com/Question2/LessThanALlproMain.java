package com.Question2;

import java.util.List;
import java.util.Scanner;

public class LessThanALlproMain {
	public static void main(String[] args) throws ProductError {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity");
		int qu=sc.nextInt();
		implementsAll a1=new implementsAll();
		List<Product> p=	a1.LessThanQuaAllPro(qu);
		p.forEach(s->System.out.println(s));
	}

}
