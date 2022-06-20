package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import entities.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao {

	private Connection conn;

	public UsuarioDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Usuario obj) {
		PreparedStatement vt = null;

		try {

			vt = conn.prepareStatement(
					"INSERT INTO bancodeteste.usuarios " + "(usuario, email, senha)" + "VALUES " + "(?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			vt.setString(1, obj.getUsuario());
			vt.setString(2, obj.getEmail());
			vt.setString(3, obj.getSenha());

			vt.executeUpdate();

		} catch (SQLException e) {

			throw new DbException(e.getMessage());

		} finally {
			DB.closeStatement(vt);
		}

	}

	@Override
	public Usuario findByEmail(Usuario obj) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement("SELECT * FROM bancodeteste.usuarios WHERE email = ? and senha= ?");
			st.setString(1, obj.getEmail());
			st.setString(2, obj.getSenha());
			rs = st.executeQuery();
			if (rs.next()) {

				Usuario user = new Usuario();
				user.setUsuario(rs.getString("email"));
				user.setUsuario(rs.getString("senha"));

				return user;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
