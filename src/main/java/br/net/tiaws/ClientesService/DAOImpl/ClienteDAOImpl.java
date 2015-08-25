package br.net.tiaws.ClientesService.DAOImpl;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import br.net.tiaws.ClientesService.DAO.ClienteDAO;
import br.net.tiaws.ClientesService.Provider.EntityManagerProvider;
import br.net.tiaws.ClientesService.model.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

	public void saveCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		EntityManager entitymanager = EntityManagerProvider.getEntityManager();

		try {
			entitymanager.getTransaction().begin();
			entitymanager.persist(cliente);
			entitymanager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entitymanager.getTransaction().rollback();
		} finally {
			entitymanager.close();
		}

	}

	public ArrayList<Cliente> getAllCliente() {
		ArrayList<Cliente> clientes = (ArrayList<Cliente>) EntityManagerProvider.getEntityManager()
				.createQuery("FROM " + Cliente.class.getName()).getResultList();
		return clientes;
	}

	public Cliente getClienteById(Long cod_cliente) {
		EntityManager entitymanager = EntityManagerProvider.getEntityManager();
		Cliente cliente = null;

		try {
			cliente = entitymanager.find(Cliente.class, cod_cliente);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			entitymanager.close();
		}
		return cliente;
	}

}
