package util;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// -NOME
	// -CPF
	// -ENDEREÇO
	// -CIDADE - UF
	// -CEP
	// -FONE

	private String name;
	private String cpf;
	private String adress;
	private String city;
	private String cep;
	private String phone;

	public Cliente() {

	}

	public Cliente(String name, String cpf, String adress, String city, String cep, String phone) {
		this.name = name;
		this.cpf = cpf;
		this.adress = adress;
		this.city = city;
		this.cep = cep;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void createList() {
		List<Cliente> list = new ArrayList<>();
		list.add(null);

	}

}
