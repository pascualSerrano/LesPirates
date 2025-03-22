package cartes;

import joueurs.Joueur;
import affichage.AffichageConsole; 
import affichage.IAffichage;

public class NormalePopMoins extends Carte {
	private IAffichage affichage;
    public NormalePopMoins() {
        super("Normale Pop Moins", Type.NORMALE_POP_MOINS);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, -1, 0, 0);
        affichage.afficherNormalePopMoins();
        
    }
}
