package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	private static Stage stage;

	private static Scene mainScene;
	private static Scene cadastroScene;

	@Override
	public void start(Stage primaryStage) throws Exception {

		stage = primaryStage;

		primaryStage.setTitle("TESTE");

		Parent fxmlMain = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));
		mainScene = new Scene(fxmlMain, 640, 400);

		Parent fxmlCadastro = FXMLLoader.load(getClass().getResource("/gui/CadastroView.fxml"));
		cadastroScene = new Scene(fxmlCadastro, 640, 400);

		primaryStage.setScene(mainScene);
		primaryStage.show();

	}

	public static void changeScreen(String scr) {

		switch (scr) {
		case "main":
			stage.setScene(mainScene);
			break;
		case "Cadastro":
			stage.setScene(cadastroScene);
		}

	}

	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
