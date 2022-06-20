package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.Cadastrar;
import application.Main;
import dao.UsuarioDaoJDBC;
import db.DB;
import entities.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.Alerts;
import util.Constraints;
import util.Criptografia;

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
	private Button inicioButton;

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

			user.setUsuario(Criptografia.criptografiaBase64Encoder(user.getUsuario()));
			user.setEmail(Criptografia.criptografiaBase64Encoder(user.getEmail()));
			user.setSenha(Criptografia.criptografiaBase64Encoder(user.getSenha()));

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
	
	@FXML
	public void onBtNewActionInicio() throws Exception {

		Main p = new Main();

		p.start(new Stage());

		Cadastrar.getStage().close();

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
