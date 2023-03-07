package firstProject.masai;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class particularSearch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product id ");
		int ProductID = sc.nextInt();

		Product product = em.find(Product.class, ProductID);

		if (product != null) {
			System.out.println(product);

		} else
			System.out.println("product is not there...");

		em.close();

	}

}
