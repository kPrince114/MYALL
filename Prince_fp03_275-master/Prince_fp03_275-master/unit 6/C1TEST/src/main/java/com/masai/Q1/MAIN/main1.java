package com.masai.Q1.MAIN;

import java.util.Scanner;

import com.masai.Q1.Execption.StudentExecption;
import com.masai.Q1.UniversityDAO.implemenorm;
import com.masai.Q1.UniversityDAO.implementjdbc;
import com.masai.Q1.bean.Student;

public class main1 {

	public static void main(String[] args) throws StudentExecption {
		main2 m = new main2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you choise jdbc/orm");
		String ch = sc.next();
		int r = m.getInstance(ch);
		if (r == 1) {
			System.out.println("you have two method ");
			System.out.println("1. deleteStudentById 2.updateStudentCGPA");
			System.out.println("use method enter 1 first method 2 second method");
			System.out.println("************************");
			System.out.println("Enter the number");
			int run = sc.nextInt();
			if (run == 1) {
				System.out.println("Enter Student id");
				int id = sc.nextInt();
				implementjdbc im = new implementjdbc();
				String s = im.deleteStudentById(id);
				System.out.println(s);
			} else {
				System.out.println("Enter Student id");
				int id = sc.nextInt();
				System.out.println("Enter student cgpa to update ");
				int cgpa = sc.nextInt();
				implementjdbc im = new implementjdbc();
				String s = im.updateStudentCGPA(id, cgpa);
				System.out.println(s);
			}
		} else if (r == 2) {
			System.out.println("you have two method ");
			System.out.println("1. findStudentById 2.saveStudent");
			System.out.println("use method enter 1 first method 2 second method");
			System.out.println("************************");
			System.out.println("Enter the number");
			int run = sc.nextInt();
			if (run == 1) {
				System.out.println("Enter student id");
				int id = sc.nextInt();
				implemenorm or = new implemenorm();
				Student st = or.findStudentById(id);
				System.out.println(st);
			} else if (run == 2) {
				System.out.println("Enter student id");
				int id = sc.nextInt();
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Enter your cgpa");
				int cgpa = sc.nextInt();
				System.out.println("Enter your address");
				String Address = sc.next();
				implemenorm or = new implemenorm();
				String s = or.saveStudent(new Student(id, name, Address, cgpa));
				System.out.println(s);
			}

		}
	}

}
