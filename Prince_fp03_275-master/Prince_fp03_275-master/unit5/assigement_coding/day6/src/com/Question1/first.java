package com.Question1;

public class first {

	public static void main(String[] args) {
		TheardA s1=new TheardA();
		ThreadB s2=new ThreadB();
		
		s1.setName("prince kumar");
		s2.setName("raj kumar");
		
		s1.start();
		s2.start();
		

	}

}
