/**
 * 
 */
package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 * @author leo_dias
 *
 */
public class Alerts {
	
	public static void mostrarAlerta(String cabecalho, String titulo, String conteudo, AlertType tipo) {
		
		Alert alerta = new Alert(tipo);
		
		alerta.setHeaderText(cabecalho);
		alerta.setTitle(titulo);
		alerta.setContentText(conteudo);
		alerta.setAlertType(tipo);
		alerta.show();
	}


}
