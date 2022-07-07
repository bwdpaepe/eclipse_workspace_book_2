package main;
	
import gui.WelkomScherm;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class StartUp extends Application {
	@Override
	public void start(Stage primaryStage) {
		WelkomScherm root = new WelkomScherm();
		Scene scene = new Scene(root, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Welkom bij JavaFX");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
