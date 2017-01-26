package br.net.tiaws.ClientesService;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.net.tiaws.ClientesService.model.Cliente;

/**
 * Hello world!
 * test
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Hello World!");

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Cliente cliente = new Cliente();
		cliente.setFirst_name("Andre");
		cliente.setLast_name("Silva");
		cliente.setEmail("andre.w.silva4@live.com");
		cliente.setPassword("123456");
		cliente.setBirthdate(new Date(1980-1900, 4-1, 5));
		cliente.setSignup_date(new Date(2015-1900,8-1,24));
		cliente.setStatus(true);
		entitymanager.persist(cliente);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
    }
}
