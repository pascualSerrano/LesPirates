package cartes;

import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class CoupDeSabre extends Carte {
	private IAffichage affichage;
    public CoupDeSabre() {
        super("Coup de Sabre", Type.COUP_DE_SABRE);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, -2);
        affichage.afficherCoupDeSabre(joueur, adversaire);
        
    }
}
