package dao;

import entities.Usuario;

public interface UsuarioDao {

	void insert(Usuario obj);

	Usuario findByEmail(Usuario obj);

}
