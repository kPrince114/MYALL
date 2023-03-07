package Empolyall;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class giveBonusToEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Empoly id ");
		int empId = sc.nextInt();
		Empoly Empoly = em.find(Empoly.class, empId);

		if (Empoly != null) {
			System.out.println("Enter bonues salary");
			int bomus=sc.nextInt();
			
			em.getTransaction().begin();
			
			Empoly.setSalary(Empoly.getSalary()-bomus);
			
			em.getTransaction().commit();
			
			System.out.println(" Empoly salary is graced...");

		} else
			System.out.println("Empoly is not there...");

		em.close();
	}
}
