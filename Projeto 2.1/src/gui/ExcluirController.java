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

public class ExcluirController implements Initializable {

	@FXML
	private TextField txtCpfExcluir;

	@FXML
	private Button btActionExcluir;

	public void onBtNewActionExcluir() {

		ClientesDaoJDBC excluir = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfExcluir.getText());

		if (c.getCpf().length() < 11) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira um CPF válido.", e.getMessage(), AlertType.ERROR);
		} else {

			excluir.deleteByCpf(c);

		}

	}

	private void initializeNodes() {

		Constraints.setTextFieldInteger(txtCpfExcluir);
		Constraints.setTextFieldMaxLength(txtCpfExcluir, 11);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();

	}

}
