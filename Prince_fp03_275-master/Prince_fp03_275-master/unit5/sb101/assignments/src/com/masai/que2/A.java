package com.masai.que2;

import java.util.Set;

public class A {

	public static void funA() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(Thread.currentThread().getName() + " is running");

		}

	}

	public void funB() {

		for (int i = 20; i <= 30; i++) {

			System.out.println(Thread.currentThread().getName() + " is running");

		}

	}

}