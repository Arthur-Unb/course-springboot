package model.dao;

import model.dao.impl.ClientesDaoJDBC;

public class DaoFactory {

	public static ClientesDao createClientesDao() {
		return new ClientesDaoJDBC(null);

	}
}
