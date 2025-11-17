package vue;
import com.sun.media.jfxmedia.logging.Logger;
import architecture.Vue;
import controleur.ControleurTableauHonneur;
import javafx.scene.layout.AnchorPane;
import vue.BadgePolice.COULEUR;
import vue.BadgePolice.TYPE_ARMOIRIE;
import vue.BadgePolice.TYPE_ETOILE;
import vue.BadgePolice.TYPE_PLAQUE;

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
		
		BadgePolice badgePolice = new BadgePolice().deCouleur(COULEUR.NOIR).armoirie(TYPE_ARMOIRIE.RONDE).auEtoile(TYPE_ETOILE.SHERIF).titreSurPlaque(TYPE_PLAQUE.LIEUTENANT).proclamant("S.W.A.T");
		
		AnchorPane espaceTravail = (AnchorPane)lookup("#espace-travail");
		espaceTravail.getChildren().add(badgePolice);
		
		
	}	
}






