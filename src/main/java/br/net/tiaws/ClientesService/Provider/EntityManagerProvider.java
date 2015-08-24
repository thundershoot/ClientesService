package br.net.tiaws.ClientesService.Provider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

	private EntityManagerProvider() {
	}

	private static EntityManagerFactory emFactory;

	public static EntityManager getEntityManager() {
		if (emFactory == null) {
			emFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		}
		return emFactory.createEntityManager();
	}
}
