package cartes;

import joueurs.Joueur;

public class NormaleViePlus extends Carte {
    public NormaleViePlus() {
        super("Normale Vie Plus", Type.NORMALE_VIE_PLUS);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, 0, -1, 0);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherNormaleViePlus();
    }
}