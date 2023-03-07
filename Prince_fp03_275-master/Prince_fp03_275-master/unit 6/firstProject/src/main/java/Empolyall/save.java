package Empolyall;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class save {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory em1 = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=em1.createEntityManager();
			System.out.println("Enter Empoly id ");
			int empId=sc.nextInt();
			System.out.println("Enter Empoly name");
			String name=sc.next();
			System.out.println("Enter Empoly address ");
			String address=sc.next();
			System.out.println("Enter Empoly salary ");
			int salary=sc.nextInt();
			Empoly e=new Empoly(empId,name,address,salary);
			em.getTransaction().begin();
			
			em.persist(e);
			
			em.getTransaction().commit();
			System.out.println("done...");
	}

}
