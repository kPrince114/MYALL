package Q1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class util {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");

	public static EntityManager privideEntityManager() {
		return emf.createEntityManager();
	}
}
