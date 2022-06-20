package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import dao.UsuarioDaoJDBC;
import db.DB;
import entities.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import util.Alerts;

public class MainViewController {

	@FXML
	private TextField txtEmailLogin;

	@FXML
	private TextField txtSenhaLogin;

	@FXML
	private Button cadastrarButton;

	@FXML
	private Button loginButton;

	@FXML
	public void onButtonCadastrar() {
		Main.changeScreen("Cadastro");

	}

	@FXML
	private void onBtLogin() {

		UsuarioDaoJDBC gravar = new UsuarioDaoJDBC(DB.getConnection());

		Usuario user = new Usuario();

		user.setEmail(txtEmailLogin.getText());
		user.setSenha(txtSenhaLogin.getText());

		if (gravar.findByEmail(user) != null) {

			loadView("/gui/CadastroView2.fxml");

		} else {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Usuário ou senha inválidos", e.getMessage(), AlertType.ERROR);

		}

	}




}
