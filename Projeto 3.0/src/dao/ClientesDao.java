package dao;

import java.util.List;

import entities.Clientes;

public interface ClientesDao {

	void insert(Clientes obj);

	void update(Clientes obj);

	Clientes findByCpf(String cpf);

	List<Clientes> findAll();

	void deleteByCpf(String string);

	void deleteByCpf(Clientes obj);

}
