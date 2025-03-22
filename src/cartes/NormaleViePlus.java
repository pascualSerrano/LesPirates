package cartes;

import joueurs.Joueur;
import affichage.AffichageConsole;
import affichage.IAffichage;

public class NormaleViePlus extends Carte {
	private IAffichage affichage;
    public NormaleViePlus() {
        super("Normale Vie Plus", Type.NORMALE_VIE_PLUS);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, 0, -1, 0);
        affichage.afficherNormaleViePlus();
    }
}