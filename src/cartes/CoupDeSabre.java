package cartes;

import joueurs.Joueur;

public class CoupDeSabre extends Carte {
	
    public CoupDeSabre() {
        super("Coup de Sabre", Type.COUP_DE_SABRE);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, -2);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherCoupDeSabre(joueur, adversaire);
        
    }
}
