package model.dao;

import java.util.List;

import entities.Clientes;

public interface ClientesDao {

	void insert(Clientes obj);

	Clientes findByCpf1(String cpf);

	List<Clientes> findAll();

	void update(Clientes obj);

	Clientes findByCpf(String cpf);

}
