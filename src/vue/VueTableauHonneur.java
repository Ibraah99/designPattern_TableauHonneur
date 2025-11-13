package vue;

import java.util.Hashtable;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurTableauHonneur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class VueTableauHonneur extends Vue {

	protected ControleurTableauHonneur controleur;
	protected static VueTableauHonneur instance = null; 
	public static VueTableauHonneur getInstance() {if(null==instance)instance = new VueTableauHonneur();return VueTableauHonneur.instance;}; 
	
	private VueTableauHonneur() 
	{
		super("honneur.fxml", VueTableauHonneur.class, 1294,743);
		super.controleur = this.controleur = new ControleurTableauHonneur();
		Logger.logMsg(Logger.INFO, "new VueTableauHonneur()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		AnchorPane badgePolice = new AnchorPane();
		badgePolice.setPrefHeight(200);
		badgePolice.setPrefWidth(200);
		badgePolice.setStyle("-fx-background-color:blue");
		
		AnchorPane espaceTravail = (AnchorPane)lookup("#espace-travail");
		espaceTravail.getChildren().add(badgePolice);
		
		ImageView ecusson = new ImageView();
		ecusson.setImage(new Image("vue/badge/armoirie.png"));
		
		badgePolice.getChildren().add(ecusson);
		
		ImageView plaque = new ImageView();
		plaque.setImage(new Image("vue/badge/plaque.png"));
		plaque.setLayoutX(100);
		plaque.setLayoutY(240);
		badgePolice.getChildren().add(plaque);
		
		ImageView etoile = new ImageView();
		etoile.setImage(new Image("vue/badge/etoile.png"));
		etoile.setLayoutX(100);
		etoile.setLayoutY(110);
		//etoile.setScaleX(-1.5);
		//etoile.setScaleY(1.5);
		badgePolice.getChildren().add(etoile);
		
		Label motto = new Label();
		motto.setText("POLICE");
		motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold;");
		motto.setLayoutX(100);
		motto.setLayoutY(60);
		badgePolice.getChildren().add(motto);
		
	}	
}






