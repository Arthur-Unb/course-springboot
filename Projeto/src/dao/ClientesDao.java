package dao;

import java.util.List;

import entities.Clientes;

public interface ClientesDao {

	void insert(Clientes obj);

	void update(Clientes obj);

	void deleteByCpf(String cpf);

	Clientes findByCpf(String cpf);

	List<Clientes> findAll();

}
