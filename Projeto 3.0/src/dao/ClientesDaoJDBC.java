package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import db.DB;
import db.DbException;
import entities.Clientes;

public class ClientesDaoJDBC implements ClientesDao {

	private Connection conn;

	public ClientesDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Clientes obj) {

		PreparedStatement vt = null;

		try {

			vt = conn.prepareStatement("INSERT INTO bancodeteste.clientes "
					+ "(CPF, Nome, Endereço, Cidade, CEP, Telefone)" + "VALUES " + "(?, ?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			vt.setString(1, obj.getCpf());
			vt.setString(2, obj.getNome());
			vt.setString(3, obj.getEndereco());
			vt.setString(4, obj.getCidade());
			vt.setString(5, obj.getCep());
			vt.setString(6, obj.getTelefone());

			vt.executeUpdate();

		} catch (SQLException e) {

			throw new DbException(e.getMessage());

		} finally {
			DB.closeStatement(vt);
		}

	}

	@Override
	public void update(Clientes obj) {
		PreparedStatement st = null;

		try {

			st = conn.prepareStatement("UPDATE bancodeteste.clientes "
					+ "SET CPF = ?, Nome = ?, Endereço = ?, Cidade = ?, CEP = ?, Telefone = ? " + "WHERE CPF = ?");

			st.setString(1, obj.getCpf());
			st.setString(2, obj.getNome());
			st.setString(3, obj.getEndereco());
			st.setString(4, obj.getCidade());
			st.setString(5, obj.getCep());
			st.setString(6, obj.getTelefone());

			st.executeUpdate();
		} catch (SQLException e) {

			throw new DbException(e.getMessage());

		} finally {

			DB.closeStatement(st);
		}

	}

	@Override
	public void deleteByCpf(Clientes obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM bancodeteste.clientes WHERE CPF = ?");

			st.setString(1, obj.getCpf());

			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Clientes findByCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByCpf(String string) {
		// TODO Auto-generated method stub

	}

}
