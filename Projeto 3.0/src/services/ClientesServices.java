package services;

import java.util.List;

import dao.ClientesDao;
import dao.DaoFactory;
import entities.Clientes;

public class ClientesServices {

	private ClientesDao dao = DaoFactory.createClientesDao();

	public List<Clientes> findAll() {
		return dao.findAll();
	}

	public void saveOrUpdate(Clientes obj) {
		if (obj.getCpf() == null) {
			dao.insert(obj);

		} else {
			dao.update(obj); 
		}
	}

	public void remove(Clientes obj) {
		dao.deleteByCpf(obj.getCpf());
	}

}
