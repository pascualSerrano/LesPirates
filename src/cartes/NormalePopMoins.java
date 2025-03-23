package cartes;

import joueurs.Joueur;

public class NormalePopMoins extends Carte {
    public NormalePopMoins() {
        super("Normale Pop Moins", Type.NORMALE_POP_MOINS);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 0, -1, 0, 0);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherNormalePopMoins();
        
    }
}
