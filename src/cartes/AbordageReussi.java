package cartes;

import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class AbordageReussi extends Carte {
	private IAffichage affichage;
    public AbordageReussi() {
        super("Abordage Réussi", Type.ABORDAGE_REUSSI);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 2, -2, -1,-3);
        //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherAbordageReussi(joueur, adversaire);
    }
}
