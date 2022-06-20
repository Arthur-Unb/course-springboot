package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.UsuarioDaoJDBC;
import db.DB;
import entities.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Alerts;
import util.Constraints;

public class CadastroViewController implements Initializable {

	@FXML
	private TextField txtUser;

	@FXML
	private TextField txtEmail;

	@FXML
	private TextField txtSenha1;

	@FXML
	private TextField txtSenha2;

	@FXML
	private Button cadastroUsuario;

	@FXML
	private void onBtCadastro() {

		UsuarioDaoJDBC gravar = new UsuarioDaoJDBC(DB.getConnection());

		Usuario user = new Usuario();

		Usuario userConfirmation = new Usuario();

		user.setUsuario(txtUser.getText());
		user.setEmail(txtEmail.getText());
		user.setSenha(txtSenha1.getText());

		userConfirmation.setUsuario(txtUser.getText());
		userConfirmation.setEmail(txtEmail.getText());
		userConfirmation.setSenha(txtSenha2.getText());

		if (isValidEmailAddressRegex(user.getEmail()) == false) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Email inválido", e.getMessage(), AlertType.ERROR);

		} else if (user.getSenha().charAt(2) == userConfirmation.getSenha().charAt(2)) {

			gravar.insert(user);

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Usuário cadastrado com sucesso", e.getMessage(), AlertType.ERROR);

			txtUser.setText("");
			txtEmail.setText("");
			txtSenha1.setText("");
			txtSenha2.setText("");

		} else {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira senhas idênticas", e.getMessage(), AlertType.ERROR);

		}

	}

	private void initializeNodes() {

		Constraints.setTextFieldMaxLength(txtUser, 15);

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();

	}

	public static boolean isValidEmailAddressRegex(String email) {
		boolean isEmailIdValid = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}

}
