package jeu;

import affichage.AffichageConsole;
import affichage.IAffichage;
import joueurs.Joueur;


public class MainJeu {
    public static void main(String[] args) {
        IAffichage affichage = new AffichageConsole();
        Jeu jeu = new Jeu();

        jeu.demarrerJeu();

        while (!jeu.estTermine()) {
            jeu.jouerTour();
        }

        Joueur gagnant, perdant;
        if (jeu.getJoueur1().getVie() <= 0 || jeu.getJoueur2().getPopularite() >= 5) {
            gagnant = jeu.getJoueur2();
            perdant = jeu.getJoueur1();
        } else {
            gagnant = jeu.getJoueur1();
            perdant = jeu.getJoueur2();
        }

        affichage.afficherFin(gagnant, perdant);
    }
}

