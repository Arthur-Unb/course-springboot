package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import util.Alerts;

public class CadastroViewController2 implements Initializable {

	@FXML
	private Button buttonItemRegistrar;

	@FXML
	private Button buttonItemAtualizar;

	@FXML
	private Button buttonItemExcluir;

	@FXML
	private Button buttonItemInicio;

	@FXML
	public void onButtonRegistrar() {
		loadView("/gui/Registrar.fxml");

	}

	@FXML
	public void onButtonAtualizar() {
		loadView("/gui/Pesquisa.fxml");

	}

	@FXML
	public void onButtonExcluir() {
		loadView("/gui/Excluir.fxml");

	}

	private synchronized void loadView(String absoluteName) {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();

			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());

		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error Loading view", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
