package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/gui/Calc.fxml"));
			Parent parent = loader.load();
			
			Scene scene = new Scene(parent);
			
			stage.setScene(scene);
			stage.setTitle("Calculadora JavaFX Léo Dias");
			stage.setResizable(false);
			stage.show();
			
			Image img = new Image("/icons/Calculadora.png");
			stage.getIcons().add(img);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
