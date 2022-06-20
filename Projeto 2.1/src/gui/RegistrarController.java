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

public class RegistrarController implements Initializable {

	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtEndereco;

	@FXML
	private TextField txtCidade;

	@FXML
	private TextField txtCep;

	@FXML
	private TextField txtTelefone;

	@FXML
	private Button btActionRegister;

	@FXML
	public void onBtNewActionRegistrar() {

		ClientesDaoJDBC gravar = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpf.getText());
		c.setNome(txtNome.getText());
		c.setEndereco(txtEndereco.getText());
		c.setCidade(txtCidade.getText());
		c.setCep(txtCep.getText());
		c.setTelefone(txtTelefone.getText());

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

			gravar.insert(c);

			System.out.println(c.getCpf().length());

		}

	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtCpf);
		Constraints.setTextFieldInteger(txtCep);
		Constraints.setTextFieldInteger(txtTelefone);

		Constraints.setTextFieldMaxLength(txtTelefone, 11);
		Constraints.setTextFieldMaxLength(txtCpf, 11);
		Constraints.setTextFieldMaxLength(txtCep, 8);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();

	}

}
