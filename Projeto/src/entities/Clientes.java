package entities;

import java.io.Serializable;
import java.util.Objects;

public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpf;

	private String name;

	private String endereco;

	private String cidade;

	private String cep;

	private String telefone;

	public Clientes() {

	}

	public Clientes(String cpf, String name, String endereco, String cidade, String cep, String telefone) {
		this.cpf = cpf;
		this.name = name;
		this.endereco = endereco;
		this.cidade = cidade;
		this.cep = cep;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(cpf, other.cpf);
	}

	@Override
	public String toString() {
		return "Clientes [cpf=" + cpf + ", name=" + name + ", endereco=" + endereco + ", cidade=" + cidade + ", cep="
				+ cep + ", telefone=" + telefone + "]";
	}

}
