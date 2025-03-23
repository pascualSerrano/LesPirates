package cartes;

import joueurs.Joueur;

public class DiscoursInspirant extends Carte {
    public DiscoursInspirant() {
        super("Discours Inspirant", Type.DISCOURS_INSPIRANT);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 2, -1, 0, 0);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherDiscoursInspirant(joueur, adversaire);
        
    }
}
