package dao;

import db.DB;

public class DaoFactory {

	public static ClientesDao createClientesDao() {
		return new ClientesDaoJDBC(DB.getConnection());
	}

}
