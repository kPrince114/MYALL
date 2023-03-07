package com.masai.Q2.utily;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class utily {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");

	public static EntityManager privideEntityManager() {
		return emf.createEntityManager();
	}
}
