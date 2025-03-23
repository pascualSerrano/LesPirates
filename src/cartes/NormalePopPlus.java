package cartes;

import joueurs.Joueur;

public class NormalePopPlus extends Carte {
    public NormalePopPlus() {
        super("Normale Pop Plus", Type.NORMALE_POP_PLUS);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, 0);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherNormalePopPlus();
    }
}
