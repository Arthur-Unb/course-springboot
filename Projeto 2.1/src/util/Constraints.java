package util;

import java.io.IOException;

import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Constraints {

	public static void setTextFieldInteger(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*")) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldMaxLength(TextField txt, int max) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() > max) {
				txt.setText(oldValue);
			}
		});
	}

	public static void setTextFieldDouble(TextField txt) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {
				txt.setText(oldValue);
			}
		});
	}
	
	public static void setTextFieldMinLength(TextField txt, int min) {
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
			if (newValue != null && newValue.length() < min) {
				IOException e = new IOException();
				
				Alerts.showAlert("IO Exception", "Insira dados v�lidos", e.getMessage(), AlertType.ERROR);
			}
		});
	}
}
