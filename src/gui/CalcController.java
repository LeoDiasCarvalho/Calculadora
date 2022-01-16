/**
 * 
 */
package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Set;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author leo_dias
 *
 */
public class CalcController implements Initializable {

	private Double number1 = 0.0, number2 = 0.0, result = 0.0;
	private Boolean ponto = false, porcento = false;
	private String operacao = null;

	@FXML
	private TextField txtResult;
	@FXML
	private Button btn0;
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;
	@FXML
	private Button btn4;
	@FXML
	private Button btn5;
	@FXML
	private Button btn6;
	@FXML
	private Button btn7;
	@FXML
	private Button btn8;
	@FXML
	private Button btn9;
	@FXML
	private Button btnSomar;
	@FXML
	private Button btnSubtrair;
	@FXML
	private Button btnMultiplicar;
	@FXML
	private Button btnDividir;
	@FXML
	private Button btnPorcento;
	@FXML
	private Button btnPonto;
	@FXML
	private Button btnDel;
	@FXML
	private Button btnC;
	@FXML
	private Button btnIgual;

	@FXML
	public void onBtn0Action() {
		if (txtResult.getText().length() == 0) {
			txtResult.setText("0");
		} else {
			txtResult.setText(txtResult.getText() + "0");
		}
	}

	@FXML
	public void onBtn1Action() {
		txtResult.setText(txtResult.getText() + "1");
	}

	@FXML
	public void onBtn2Action() {
		txtResult.setText(txtResult.getText() + "2");
	}

	@FXML
	public void onBtn3Action() {
		txtResult.setText(txtResult.getText() + "3");
	}

	@FXML
	public void onBtn4Action() {
		txtResult.setText(txtResult.getText() + "4");
	}

	@FXML
	public void onBtn5Action() {
		txtResult.setText(txtResult.getText() + "5");
	}

	@FXML
	public void onBtn6Action() {
		txtResult.setText(txtResult.getText() + "6");
	}

	@FXML
	public void onBtn7Action() {
		txtResult.setText(txtResult.getText() + "6");
	}

	@FXML
	public void onBtn8Action() {
		txtResult.setText(txtResult.getText() + "8");
	}

	@FXML
	public void onBtn9Action() {
		txtResult.setText(txtResult.getText() + "9");
	}

	@FXML
	public void onBtnSomarAction() {

		Locale.setDefault(Locale.US);

		if (txtResult.getText().length() == 0) {
			Alerts.mostrarAlerta("Information", null, "Digite um número", AlertType.INFORMATION);
		} else {

			number1 = Double.parseDouble(txtResult.getText());
			operacao = "somar";
			txtResult.setText("");
			ponto = false;
		}
	}

	@FXML
	public void onBtnSubtrairAction() {

		Locale.setDefault(Locale.US);

		if (txtResult.getText().length() == 0) {
			Alerts.mostrarAlerta("Information", null, "Digite um número", AlertType.INFORMATION);
		} else {
			number1 = Double.parseDouble(txtResult.getText());
			operacao = "subtrair";
			txtResult.setText("");
			ponto = false;
		}

	}

	@FXML
	public void onBtnMultiplicarAction() {

		Locale.setDefault(Locale.US);

		if (txtResult.getText().length() == 0) {
			Alerts.mostrarAlerta("Information", null, "Digite um número", AlertType.INFORMATION);
		} else {

			number1 = Double.parseDouble(txtResult.getText());
			operacao = "multiplicar";
			txtResult.setText("");
			ponto = false;
		}

	}

	@FXML
	public void onBtnDividirAction() throws ArithmeticException {

		Locale.setDefault(Locale.US);

		if (txtResult.getText().length() == 0) {
			Alerts.mostrarAlerta("Information", null, "Digite um número", AlertType.INFORMATION);
		} else {

			number1 = Double.parseDouble(txtResult.getText());
			operacao = "dividir";
			txtResult.setText("");
			ponto = false;
		}

	}

	@FXML
	public void onBtnPontoAction() {

		Locale.setDefault(Locale.US);

		if (txtResult.getText().length() == 0) {
			txtResult.setText("0.");
			ponto = true;
		}

		if (ponto == true
				|| Double.parseDouble(txtResult.getText()) > Math.floor(Double.parseDouble(txtResult.getText()))) {
			txtResult.setText(txtResult.getText());
		} else {
			txtResult.setText(txtResult.getText() + ".");
			ponto = true;
		}
	}

	@FXML
	public void onBtnCAction() {

		if (txtResult.getText().length() == 0) {
			txtResult.setText("");
		} else {

			String texto = txtResult.getText();
			texto = texto.substring(0, texto.length() - 1);
			txtResult.setText(texto);

			if (Double.parseDouble(txtResult.getText()) > Math.floor(Double.parseDouble(txtResult.getText()))) {
				ponto = true;
			} else {
				ponto = false;
			}
		}

	}

	@FXML
	public void onBtnDelAction() {
		txtResult.setText("");
		number1 = null;
		number2 = null;
		result = null;
		operacao = null;
		ponto = false;
	}

	@FXML
	public void onBtnPorcentoAction() {

		Locale.setDefault(Locale.US);

		number2 = Double.parseDouble(txtResult.getText());
		
		switch (operacao) {
		case "somar":
			result = ((number2 / 100) * number1) + number1;
			txtResult.setText("");
			porcento = true;
			break;
		case "subtrair":
			result = number1 - ((number2 / 100) * number1);
			txtResult.setText("");
			porcento = true;
			break;
		case "multiplicar":
			result = (number2 / 100) * number1;
			txtResult.setText("");
			porcento = true;
			break;
		case "dividir":
			if (number2 == 0) {
				Alerts.mostrarAlerta("Erro", null, "Número infinito! não pode dividir por 0(zero)", AlertType.ERROR);
				ponto = false;
				porcento = false;
				operacao = null;
				number1 = 0.0;
				number2 = 0.0;
				result = 0.0;
				txtResult.setText("");
				break;
			} else {
				result = (number1 * 100) / number2;
				txtResult.setText("");
				porcento = true;
				break;
			}
		}
	}

	@FXML
	public void onBtnIgualAction() {

		Locale.setDefault(Locale.US);

		if (number1 == null || number2 == null) {
			txtResult.setText(txtResult.getText());
		} else if (porcento == true) {
			txtResult.setText(String.format("%.2f", result));

		} else {

			number2 = Double.parseDouble(txtResult.getText());

			switch (operacao) {

			case "somar":
				result = number1 + number2;
				txtResult.setText(String.format("%.2f", result));
				ponto = false;
				break;

			case "subtrair":
				result = number1 - number2;
				txtResult.setText(String.format("%.2f", result));
				ponto = false;
				break;

			case "multiplicar":
				result = number1 * number2;
				txtResult.setText(String.format("%.2f", result));
				ponto = false;
				break;

			case "dividir":
				if (number2 == 0) {
					Alerts.mostrarAlerta("Erro", null, "Resultado infinito! Não pode dividir por 0(zero)!",
							AlertType.ERROR);
				} else {
					result = number1 / number2;
					txtResult.setText(String.format("%.2f", result));
					ponto = false;
				}
				break;
			}
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		Set.setTextFieldMaxLength(txtResult, 12);

	}

}
