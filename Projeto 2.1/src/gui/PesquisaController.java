package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.ClientesDaoJDBC;
import db.DB;
import entities.Clientes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import util.Alerts;
import util.Constraints;

public class PesquisaController implements Initializable {

	@FXML
	private TextField txtCpfSearch;

	@FXML
	private TextField txtNomeSearch;

	@FXML
	private TextField txtEnderecoSearch;

	@FXML
	private TextField txtCidadeSearch;

	@FXML
	private TextField txtCepSearch;

	@FXML
	private TextField txtTelefoneSearch;

	@FXML
	private TextField txtCpfReturn;

	@FXML
	private Button btActionSearch;

	@FXML
	private Button btActionUpdate;

	@FXML
	public void onBtNewActionBuscar() {

		ClientesDaoJDBC pesquisa = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfSearch.getText());

		pesquisa.findByCpf(c.getCpf());

		txtCpfReturn.setText(pesquisa.findByCpf(c.getCpf()).getCpf());

		txtNomeSearch.setText(pesquisa.findByCpf(c.getCpf()).getNome());

		txtEnderecoSearch.setText(pesquisa.findByCpf(c.getCpf()).getEndereco());

		txtCidadeSearch.setText(pesquisa.findByCpf(c.getCpf()).getCidade());

		txtCepSearch.setText(pesquisa.findByCpf(c.getCpf()).getCep());

		txtTelefoneSearch.setText(pesquisa.findByCpf(c.getCpf()).getTelefone());

	}

	@FXML
	public void onBtNewActionUpdate() {

		ClientesDaoJDBC gravar = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfReturn.getText());
		c.setNome(txtNomeSearch.getText());
		c.setEndereco(txtEnderecoSearch.getText());
		c.setCidade(txtCidadeSearch.getText());
		c.setCep(txtCepSearch.getText());
		c.setTelefone(txtTelefoneSearch.getText());

		if (c.getCpf().length() < 11) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira um CPF válido", e.getMessage(), AlertType.ERROR);

		} else if (c.getTelefone().length() < 11) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira um telefone válido", e.getMessage(), AlertType.ERROR);

		} else if (c.getCep().length() < 8) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira um CEP válido", e.getMessage(), AlertType.ERROR);

		} else {

			gravar.update(c);
		}

		System.out.println(c);

	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtCpfSearch);
		Constraints.setTextFieldInteger(txtCpfSearch);
		Constraints.setTextFieldInteger(txtCepSearch);
		Constraints.setTextFieldInteger(txtTelefoneSearch);

		Constraints.setTextFieldMaxLength(txtTelefoneSearch, 11);
		Constraints.setTextFieldMaxLength(txtCpfSearch, 11);
		Constraints.setTextFieldMaxLength(txtCpfReturn, 11);
		Constraints.setTextFieldMaxLength(txtCepSearch, 8);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();

	}

}
