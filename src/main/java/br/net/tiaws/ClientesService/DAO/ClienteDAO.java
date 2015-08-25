package br.net.tiaws.ClientesService.DAO;

import java.util.ArrayList;

import br.net.tiaws.ClientesService.model.Cliente;

public interface ClienteDAO {

	public void saveCliente(Cliente cliente);

	public ArrayList<Cliente> getAllCliente();

	public Cliente getClienteById(Long cod_cliente);
}
