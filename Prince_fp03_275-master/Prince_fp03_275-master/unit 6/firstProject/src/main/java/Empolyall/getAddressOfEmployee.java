package Empolyall;

import java.util.Scanner;

import firstProject.masai.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class getAddressOfEmployee {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Empoly id ");
		int empId = sc.nextInt();

		Empoly Empoly = em.find(Empoly.class, empId);

		if (Empoly != null) {
			System.out.println(Empoly.getAddress());

		} else
			System.out.println("Empoly is not there...");

		em.close();
	}
}
