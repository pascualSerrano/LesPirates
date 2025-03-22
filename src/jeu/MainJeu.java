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
        
        
        if (jeu.estTermine()) {
            Joueur[] resultat = jeu.resultatJeu();
            Joueur gagnant = resultat[0];
            Joueur perdant = resultat[1];
            
            affichage.afficherFin(gagnant, perdant);
        } 
    }
}

