package cartes;

import joueurs.Joueur;
import affichage.AffichageConsole;
import affichage.IAffichage;

public class NormaleVieMoins extends Carte {
	private IAffichage affichage;
    public NormaleVieMoins() {
        super("Normale Vie Moins", Type.NORMALE_VIE_MOINS);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, 0, 0, -1);
        affichage.afficherMessage("Frappez fort mes boucaniers!");
    }
}
