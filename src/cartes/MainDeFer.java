package cartes;

import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class MainDeFer extends Carte {
	private IAffichage affichage;
    public MainDeFer() {
        super("Main de Fer", Type.MAIN_DE_FER);
        affichage = new AffichageConsole();
    }

    @Override
    public void effetSpecial(Joueur joueur, Joueur adversaire) {
        appliquerEffet(joueur, adversaire, 1, 0, 0, -1);
        affichage.afficherMessage("Belle droite " + joueur.getNom() + "!");
    }
}
