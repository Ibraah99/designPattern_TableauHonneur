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
		this.setCouleur(COULEUR.BLEU);

		
		
		 ecusson = new ImageView();
		this.setArmoirie(TYPE_ARMOIRIE.ECUSSON);
		this.getChildren().add(ecusson);
		
		plaque = new ImageView();
		this.setPlaque(TYPE_PLAQUE.SERGENT);
		this.getChildren().add(plaque);
		
		 etoile = new ImageView();
		this.setEtoile(TYPE_ETOILE.ETOILE);
		this.getChildren().add(etoile);
		
		motto = new Label();
		this.setMotto("POLICE");
		motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold;");
		motto.setLayoutX(100);
		motto.setLayoutY(60);
		this.getChildren().add(motto);
	}
	
	
	public BadgePolice auEtoile(TYPE_ETOILE type) {
		
		this.setEtoile(type);
		return this;
	}
	
	public BadgePolice armoirie(TYPE_ARMOIRIE type) {
		
		this.setArmoirie(type);
		return this;
	}
	
	public BadgePolice titreSurPlaque(TYPE_PLAQUE type) {
			
			this.setPlaque(type);
			return this;
		}
	
	public BadgePolice deCouleur(COULEUR couleur) {
		
		this.setCouleur(couleur);
		return this;
	}
	
	public BadgePolice proclamant(String texte) {
			
			this.setMotto(texte);
			return this;
		}
		
	
	public enum TYPE_ETOILE{ETOILE, SHERIF, ARMYFORCE, ARMYDIVISION}
	protected ImageView etoile;
	public void setEtoile(TYPE_ETOILE type) {
		
		if(TYPE_ETOILE.ARMYDIVISION == type)etoile.setImage(new Image("vue/badge/etoile4.png"));
		if(TYPE_ETOILE.SHERIF == type)etoile.setImage(new Image("vue/badge/etoile3.png"));
		if(TYPE_ETOILE.ARMYFORCE == type)etoile.setImage(new Image("vue/badge/etoile2.png"));
		else etoile.setImage(new Image("vue/badge/etoile.png"));
		
		etoile.setLayoutX(100);
		etoile.setLayoutY(110);
		//etoile.setScaleX(-1.5);
		//etoile.setScaleY(1.5);
		
	}
	
	
	protected ImageView plaque;
	public enum TYPE_PLAQUE  {SERGENT , LIEUTENANT, CAPITAINE, OFFICIER }
	public void setPlaque(TYPE_PLAQUE type) {
		
		
		if (TYPE_PLAQUE.CAPITAINE == type )plaque.setImage(new Image("vue/badge/plaque3.png"));
		if (TYPE_PLAQUE.LIEUTENANT == type )plaque.setImage(new Image("vue/badge/plaque4.png"));
		if (TYPE_PLAQUE.SERGENT == type )plaque.setImage(new Image("vue/badge/plaque.png"));
		if (TYPE_PLAQUE.OFFICIER == type )plaque.setImage(new Image("vue/badge/plaque2.png"));
		
		
		plaque.setLayoutX(100);
		plaque.setLayoutY(230);
	}
	protected ImageView ecusson;
	public enum TYPE_ARMOIRIE {ECUSSON, RONDE};
	public void setArmoirie(TYPE_ARMOIRIE type) {
		if(TYPE_ARMOIRIE.ECUSSON == type) ecusson.setImage(new Image("vue/badge/armoirie.png"));
		else ecusson.setImage(new Image("vue/badge/armoirie-ronde.png"));
			
	}
	protected Label motto;
	public void setMotto(String texte) {
		
		motto.setText(texte);
	}
	
	public enum COULEUR{ROUGE, BLEU, JAUNE, NOIR}
	public void setCouleur(COULEUR couleur)
	{
		if(COULEUR.BLEU == couleur)
			this.setStyle("-fx-background-color:blue");
		else if(COULEUR.JAUNE == couleur)
			this.setStyle("-fx-background-color:yellow");
		else if(COULEUR.NOIR == couleur)
			this.setStyle("-fx-background-color:black");
		else
			this.setStyle("-fx-background-color:red");
	}


}
