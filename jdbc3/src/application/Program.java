package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import db.DB;

public class Program {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;

		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("INSERT INTO clientes " + "(CPF, Nome, Endereço, Cidade, CEP, Telefone) "
					+ "VALUES " + "(?, ?, ?, ?, ?,?)");

			st.setInt(1, 44885);
			st.setString(2, "Ian");
			st.setString(3, "Lago Paranoá");
			st.setString(4, "Brasília");
			st.setInt(5, 4025645);
			st.setInt(6, 198461);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
