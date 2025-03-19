package cartes;

import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class NormalePopPlus extends Carte {
	private IAffichage affichage;
    public NormalePopPlus() {
        super("Normale Pop Plus", Type.NORMALE_POP_PLUS);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, 0);
        affichage.afficherMessage("Sacrés matelots, ils me croient quand je leurs dis on va gagner hahaha!");
    }
}
