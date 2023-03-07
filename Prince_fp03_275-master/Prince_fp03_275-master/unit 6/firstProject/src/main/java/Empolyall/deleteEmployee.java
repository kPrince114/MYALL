package Empolyall;

import java.util.Scanner;

import firstProject.masai.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class deleteEmployee {
	public static void main(String[] args) {
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em= emf.createEntityManager();
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter empid to delete ");
		int empId=sc.nextInt();
		
		Empoly Empoly= em.find(Empoly.class, empId);
		
		if(Empoly != null){
			
			em.getTransaction().begin();
			
			em.remove(Empoly);
			
			em.getTransaction().commit();
			
			
			System.out.println("Empoly removed....");
			
		}else
			System.out.println("Empoly not found...");
		
		em.close();
		
		
		System.out.println("done...");
	}
}
