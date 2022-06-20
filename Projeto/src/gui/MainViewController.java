package gui;

import entities.Clientes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.dao.impl.ClientesDaoJDBC;

public class MainViewController {

	@FXML
	private Button btRegistrar;

	@FXML
	private TextField cpf;

	@FXML
	private TextField nome;

	@FXML
	private TextField endereco;

	@FXML
	private TextField cidade;

	@FXML
	private TextField cep;

	@FXML
	private TextField telefone;

	@FXML
	private void onBtRegistrarAction(ActionEvent event) {
		Clientes c = new Clientes();
		c.setCpf(cpf.getText());
		c.setName(nome.getText());
		c.setEndereco(endereco.getText());
		c.setCidade(cidade.getText());
		c.setCep(cep.getText());
		c.setTelefone(telefone.getText());

		ClientesDaoJDBC gravar = null;

		gravar.insert(c);

	}

}
