package com.masai.Q2.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.masai.Q2.Dao.implementinterface;
import com.masai.Q2.bean.Book;
import com.masai.Q2.bean.BookExecption;
public class main {
	public static void main(String[] args) {
		implementinterface em=new implementinterface();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your work");
		System.out.println("1.getInformation , 2.createnewBook , 3.deleteBookById , 4.updatePriceById");
		System.out.println("*******************");
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			Book book = em.getInformation(id);
			System.out.println(book);
		}
		else if(num==2) {
//			
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			System.out.println("Enter your name ");
			String name=sc.next();
			System.out.println("Enter your author");
			String author=sc.next();
			System.out.println("Enter publication");
			String publication=sc.next();
			System.out.println("ENter book page");
			int page =sc.nextInt();
			System.out.println("Enter price");
			int price =sc.nextInt();
			Date date = new Date();
			SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String stringDate= DateFor.format(date);
			String cr = em.createnewBook(new Book(id, name, author, publication, page, price, stringDate));
			System.out.println(cr);
		}
		else if(num==3) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			try {
				String book = em.deleteBookById(id);
				System.out.println(book);
			} catch (BookExecption e) {
				System.out.println(e.getMessage());
			}
		}
		else if(num==4) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			System.out.println("Enter price ");
			int price=sc.nextInt();
			try {
				String book = em.updatePriceById(id,price);
				System.out.println(book);
			} catch (BookExecption e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
