package com.masai.Q1.common;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");

	public static EntityManager privideEntityManager() {
		return emf.createEntityManager();
	}

}
