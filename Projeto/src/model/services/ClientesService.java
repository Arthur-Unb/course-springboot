package model.services;

import java.util.List;

import entities.Clientes;
import model.dao.ClientesDao;
import model.dao.DaoFactory;

public class ClientesService {

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

}
