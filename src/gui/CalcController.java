/**
 * 
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @author leo_dias
 *
 */
public class CalcController implements Initializable{
	
	private Double number1 = 0.0, number2 = 0.0, result = 0.0;
	private Boolean ponto = false;
	private Character operacao = null;
	
	@FXML private TextField txtResult;
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnSomar;
	@FXML private Button btnSubtrair;
	@FXML private Button btnMultiplicar;
	@FXML private Button btnDividir;
	@FXML private Button btnPorcento;
	@FXML private Button btnPonto;
	@FXML private Button btnDel;
	@FXML private Button btnC;
	
	@FXML
	public void onBtn0Action() {
		if(txtResult.getText().length() == 0) {
			txtResult.setText("0");
		}
		else {
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
	
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
