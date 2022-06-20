package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import application.Login;
import application.Main;
import dao.ClientesDaoJDBC;
import db.DB;
import entities.Clientes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import util.Alerts;
import util.Constraints;
import util.Criptografia;

public class RegistrarController implements Initializable {

	@FXML
	private Text textShowRegistrar;
	@FXML
	private Text textShowAtualizar;
	@FXML
	private Text textShowExcluir;

	@FXML
	private TextField txtCpfRegistrar;
	@FXML
	private TextField txtCpfBuscar;
	@FXML
	private TextField txtCpfExcluir;
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
	private Button pesquisarButton;
	@FXML
	private Button cadastrarButton;
	@FXML
	private Button atualizarButton;
	@FXML
	private Button excluirButton;
	@FXML
	private Button inicioButton;

	Timer timer = new Timer();

	public void LimparTexto(Text t) {
		int delay = 2000; // delay de 2 seg.
		int interval = 15000; // intervalo de 15 seg.

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				t.setText("");
			}
		}, delay, interval);
	}

	@FXML
	public void onBtNewActionRegistrar() {

		ClientesDaoJDBC gravar = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfRegistrar.getText());
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

			c.setCpf(Criptografia.criptografiaBase64Encoder(c.getCpf()));
			c.setNome(Criptografia.criptografiaBase64Encoder(c.getNome()));
			c.setEndereco(Criptografia.criptografiaBase64Encoder(c.getEndereco()));
			c.setCidade(Criptografia.criptografiaBase64Encoder(c.getCidade()));
			c.setCep(Criptografia.criptografiaBase64Encoder(c.getCep()));
			c.setTelefone(Criptografia.criptografiaBase64Encoder(c.getTelefone()));

			gravar.insert(c);

			txtCpfRegistrar.setText("");
			txtNome.setText("");
			txtCidade.setText("");
			txtCep.setText("");
			txtEndereco.setText("");
			txtTelefone.setText("");

			textShowRegistrar.setText("Usuário cadastrado com sucesso!");

			LimparTexto(textShowRegistrar);

		}

	}

	@FXML
	private void onBtNewActionPesquisar() {

		ClientesDaoJDBC pesquisa = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(Criptografia.criptografiaBase64Encoder(txtCpfBuscar.getText()));

		pesquisa.findByCpf(c.getCpf());

		System.out.println(pesquisa.findByCpf(c.getCpf()).getCpf());

		txtCpfRegistrar.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getCpf()));

		txtNome.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getNome()));

		txtEndereco.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getEndereco()));

		txtCidade.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getCidade()));

		txtCep.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getCep()));

		txtTelefone.setText(Criptografia.descriptografiaBase64Decode(pesquisa.findByCpf(c.getCpf()).getTelefone()));

		txtCpfBuscar.setText("");

	}

	@FXML
	private void onBtNewActionAtualizar() {
		ClientesDaoJDBC gravar = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfRegistrar.getText());
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

			c.setCpf(Criptografia.criptografiaBase64Encoder(c.getCpf()));
			c.setNome(Criptografia.criptografiaBase64Encoder(c.getNome()));
			c.setEndereco(Criptografia.criptografiaBase64Encoder(c.getEndereco()));
			c.setCidade(Criptografia.criptografiaBase64Encoder(c.getCidade()));
			c.setCep(Criptografia.criptografiaBase64Encoder(c.getCep()));
			c.setTelefone(Criptografia.criptografiaBase64Encoder(c.getTelefone()));

			gravar.update(c);

			txtNome.setText("");
			txtEndereco.setText("");
			txtCidade.setText("");
			txtCep.setText("");
			txtTelefone.setText("");
			txtCpfRegistrar.setText("");

			textShowAtualizar.setText("Usuário atualizado com sucesso!");

			LimparTexto(textShowAtualizar);
		}

	}

	@FXML
	private void onBtNewActionExcluir() {

		ClientesDaoJDBC excluir = new ClientesDaoJDBC(DB.getConnection());

		Clientes c = new Clientes();

		c.setCpf(txtCpfExcluir.getText());

		if (c.getCpf().length() < 11) {

			IOException e = new IOException();

			Alerts.showAlert("IO Exception", "Insira um CPF válido.", e.getMessage(), AlertType.ERROR);
		} else {

			c.setCpf(Criptografia.criptografiaBase64Encoder(c.getCpf()));

			excluir.deleteByCpf(c);

			textShowExcluir.setText("Usuário excluído com sucesso!");

			txtCpfExcluir.setText("");

			LimparTexto(textShowExcluir);

		}
	}
	
	@FXML
	public void onBtNewActionInicio() throws Exception {

		Main p = new Main();

		p.start(new Stage());

		Login.getStage().close();

	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtCpfRegistrar);
		Constraints.setTextFieldInteger(txtCpfExcluir);
		Constraints.setTextFieldInteger(txtCpfBuscar);
		Constraints.setTextFieldInteger(txtCep);
		Constraints.setTextFieldInteger(txtTelefone);

		Constraints.setTextFieldMaxLength(txtTelefone, 11);
		Constraints.setTextFieldMaxLength(txtCpfRegistrar, 11);
		Constraints.setTextFieldMaxLength(txtCpfExcluir, 11);
		Constraints.setTextFieldMaxLength(txtCpfBuscar, 11);
		Constraints.setTextFieldInteger(txtCpfBuscar);
		Constraints.setTextFieldInteger(txtCpfExcluir);
		Constraints.setTextFieldMaxLength(txtCep, 8);

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();

	}

}
