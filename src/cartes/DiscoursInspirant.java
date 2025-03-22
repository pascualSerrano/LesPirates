package cartes;

import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class DiscoursInspirant extends Carte {
	private IAffichage affichage;
    public DiscoursInspirant() {
        super("Discours Inspirant", Type.DISCOURS_INSPIRANT);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 2, -1, 0, 0);
        affichage.afficherDiscoursInspirant(joueur, adversaire);
        
    }
}
