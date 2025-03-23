package cartes;

import joueurs.Joueur;

public class AbordageReussi extends Carte {
    public AbordageReussi() {
        super("Abordage Réussi", Type.ABORDAGE_REUSSI);
        
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 2, -2, -1,-3);
        //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherAbordageReussi(joueur, adversaire);
    }
}
