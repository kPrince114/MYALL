package firstProject.masai;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory em1 = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em=em1.createEntityManager();
		//EntityTransaction et= em.getTransaction();

		for(int i=1;i<=5;i++) {
			System.out.println("Enter product id ");
			int id=sc.nextInt();
			System.out.println("Enter product name");
			String name=sc.next();
			System.out.println("Enter product price ");
			int price=sc.nextInt();
			System.out.println("Enter product quantity ");
			int quantity=sc.nextInt();
			Product p=new Product(id,name,price,quantity);
			em.getTransaction().begin();
			
			em.persist(p);
			
			em.getTransaction().commit();
			System.out.println("done..."+i);
		}
		
	}
}
