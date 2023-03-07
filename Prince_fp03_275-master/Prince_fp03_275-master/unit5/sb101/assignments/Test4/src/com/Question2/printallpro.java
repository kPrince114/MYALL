package com.Question2;

import java.util.List;

public class printallpro {
	public static void main(String[] args) throws ProductError {
		implementsAll a1=new implementsAll();
		List<Product>p=	a1.printall();
		p.forEach(s->System.out.println(s));
	}
}
