package gui;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class WelkomScherm extends Pane {

	public WelkomScherm() {
		// TODO Auto-generated constructor stub
		
		Label lblWelkom = new Label("Welkom bij JavaFX !");
		
		ImageView ivImage = new ImageView(
				new Image(getClass().getResourceAsStream("/images/bug.png"))
		);
		
		lblWelkom.setLayoutX(200);
		lblWelkom.setLayoutY(10);
		ivImage.setLayoutX(50);
		ivImage.setLayoutY(50);
		
		this.getChildren().addAll(lblWelkom, ivImage);
	}

	

}
