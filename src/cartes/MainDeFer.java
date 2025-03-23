package cartes;

import joueurs.Joueur;

public class MainDeFer extends Carte {
    public MainDeFer() {
        super("Main de Fer", Type.MAIN_DE_FER);
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, -1);
      //appliquerEffet(joueur, adversaire, PopJoueur, PopAdversaire, VieJoueur, VieAdversaire)
        affichage.afficherMainDeFer(joueur);
    }
}
