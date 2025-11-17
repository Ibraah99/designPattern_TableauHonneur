package vue;
import com.sun.media.jfxmedia.logging.Logger;
import architecture.Vue;
import controleur.ControleurTableauHonneur;
import javafx.scene.layout.AnchorPane;

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
		
		BadgePolice badgePolice = new BadgePolice();
		
		AnchorPane espaceTravail = (AnchorPane)lookup("#espace-travail");
		espaceTravail.getChildren().add(badgePolice);
		
		
	}	
}






