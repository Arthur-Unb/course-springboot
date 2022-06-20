package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Cadastrar;
import application.Login;
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
import util.Criptografia;

public class MainViewController implements Initializable {

	@FXML
	private TextField txtEmailLogin;

	@FXML
	private TextField txtSenhaLogin;

	@FXML
	private Button cadastrarButton;

	@FXML
	private Button loginButton;

	@FXML
	public void onButtonCadastrar() throws Exception {

		Cadastrar p = new Cadastrar();

		p.start(new Stage());

		Main.getStage().close();

	}

	@FXML
	private void onBtLogin() throws Exception {

		UsuarioDaoJDBC gravar = new UsuarioDaoJDBC(DB.getConnection());

		Usuario user = new Usuario();

		user.setEmail(txtEmailLogin.getText());
		user.setSenha(txtSenhaLogin.getText());
		
		user.setEmail(Criptografia.criptografiaBase64Encoder(user.getEmail()));
		user.setSenha(Criptografia.criptografiaBase64Encoder(user.getSenha()));
		
		if (gravar.findByEmail(user) != null) {

			Login p = new Login();

			p.start(new Stage());

			Main.getStage().close();

		} else {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Usuário ou senha inválidos", e.getMessage(), AlertType.ERROR);

		}

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
