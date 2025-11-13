package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgePolice  extends AnchorPane{
	
	public BadgePolice() {
		//AnchorPane badgePolice = new AnchorPane();
		this.setPrefHeight(200);
		this.setPrefWidth(200);
		this.setStyle("-fx-background-color:blue");
		
		
		ImageView ecusson = new ImageView();
		ecusson.setImage(new Image("vue/badge/armoirie.png"));
		
		this.getChildren().add(ecusson);
		
		ImageView plaque = new ImageView();
		plaque.setImage(new Image("vue/badge/plaque.png"));
		plaque.setLayoutX(100);
		plaque.setLayoutY(230);
		this.getChildren().add(plaque);
		
		ImageView etoile = new ImageView();
		etoile.setImage(new Image("vue/badge/etoile.png"));
		etoile.setLayoutX(100);
		etoile.setLayoutY(110);
		//etoile.setScaleX(-1.5);
		//etoile.setScaleY(1.5);
		this.getChildren().add(etoile);
		
		Label motto = new Label();
		motto.setText("POLICE");
		motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold;");
		motto.setLayoutX(100);
		motto.setLayoutY(60);
		this.getChildren().add(motto);
	}

}
