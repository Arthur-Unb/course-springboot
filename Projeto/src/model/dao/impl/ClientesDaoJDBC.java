package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import entities.Clientes;
import model.dao.ClientesDao;

public class ClientesDaoJDBC implements ClientesDao {

	private Connection conn;

	public ClientesDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Clientes obj) {

		PreparedStatement st = null;
		try {

			conn = DB.getConnection();

			st = conn.prepareStatement("INSERT INTO clientes" + "(CPF, Nome, Endereço, Cidade, CEP, Telefone)"
					+ "VALUES" + "(?,?,?,?,?,?)");

			st.setString(1, obj.getCpf());
			st.setString(2, obj.getName());
			st.setString(3, obj.getEndereco());
			st.setString(4, obj.getCidade());
			st.setString(5, obj.getCep());
			st.setString(6, obj.getTelefone());

			int rowsAffected = st.executeUpdate();

			System.out.println(rowsAffected);

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		DB.closeStatement(st);
	}

	@Override
	public Clientes findByCpf(String cpf) {
		return null;
	}

	@Override
	public List<Clientes> findAll() {
		return null;
	}

	@Override
	public void update(Clientes obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Clientes findByCpf1(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
