package cartes;

import joueurs.Joueur;

public class NormaleVieMoins extends Carte {
    public NormaleVieMoins() {
        super("Normale Vie Moins", Type.NORMALE_VIE_MOINS);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, 0, 0, -1);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherNormaleVieMoins();
    }
}
