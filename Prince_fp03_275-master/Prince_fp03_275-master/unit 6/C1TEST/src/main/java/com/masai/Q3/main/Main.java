package com.masai.Q3.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.masai.Q2.Dao.implementinterface;
import com.masai.Q2.bean.Book;
import com.masai.Q2.bean.BookExecption;
import com.masai.Q3.Dao.implall;
import com.masai.Q3.bean.Courier;

public class Main {
	public static void main(String[] args) {
//		public Courier getInfById(int id);
//		public String createnewShipment(Courier c);
//		public String deletecou(int id);
//		public String updateCou(int id,String content, String address);
		implall em=new implall();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your work");
		System.out.println("1.getInfById , 2.createnewShipment , 3.deletecou , 4.updateCou");
		System.out.println("*******************");
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			Courier Courier = em.getInfById(id);
			System.out.println(Courier);
		}
		else if(num==2) {
//			private String packageNumber;
//			private String content;
//			private double weight;
//			private String senderAddress;
//			private String recipientAddress;
//			private String created_timestamp;
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			System.out.println("ENter page Number");
			String pageNo=sc.next();
			System.out.println("ENter wigth in kg");
			double weight =sc.nextDouble();
			System.out.println("Enter your context");
			String context=sc.next();
			System.out.println("Enter address ");
			String senderAddress =sc.next();
			System.out.println("Enter recipientAddress");
			String recipientAddress =sc.next();
			int price =sc.nextInt();
			Date date = new Date();
			SimpleDateFormat DateFor = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String stringDate= DateFor.format(date);
			String cr = em.createnewShipment(new Courier(id, pageNo, context, weight, senderAddress, recipientAddress, stringDate));
			System.out.println(cr);
		}
		else if(num==3) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			try {
				String deletecou = em.deletecou(id);
				System.out.println(deletecou);
			} catch (BookExecption e) {
				System.out.println(e.getMessage());
			}
		}
		else if(num==4) {
			System.out.println("Enter your book id");
			int id=sc.nextInt();
			System.out.println("Enter your context");
			String context=sc.next();
			System.out.println("Enter address ");
			String Address =sc.next();
			
			try {
				String upecou = em.updateCou(id,context,Address);
				System.out.println(upecou);
			} catch (BookExecption e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
