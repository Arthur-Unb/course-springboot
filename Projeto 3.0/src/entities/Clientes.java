package entities;

import java.util.Objects;

public class Clientes {

	private String cpf;

	private String nome;

	private String endereco;

	private String cidade;

	private String cep;

	private String telefone;

	public Clientes() {

	}

	public Clientes(String cpf, String nome, String endereco, String cidade, String cep, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		return Objects.hash(cep, cidade, cpf, endereco, nome, telefone);
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
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

	@Override
	public String toString() {
		return "Clientes [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", cep="
				+ cep + ", telefone=" + telefone + "]";
	}
}
