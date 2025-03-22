package jeu;

import cartes.*;
import joueurs.Joueur;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class Jeu {
    private Joueur joueur1;
    private Joueur joueur2;
    private Pioche pioche;
    private IAffichage affichage;

    public Jeu() {
        joueur1 = new Joueur("Jack le Borgne");
        joueur2 = new Joueur("Bill Jambe-de-Bois");
        pioche = new Pioche();
        affichage = new AffichageConsole();
    }

    public void demarrerJeu() {
    	affichage.afficherDebutJeu();
        
        for (int i = 0; i < 5; i++) {
            pioche.piocherCarte(joueur1);
            pioche.piocherCarte(joueur2);
        }
    }

    public void jouerTour() {
        jouerTour(joueur1, joueur2);
        if (!estTermine()) {
            jouerTour(joueur2, joueur1);
        }
    }

    private void jouerTour(Joueur joueur, Joueur adversaire) {
        
    	
        affichage.afficherTourJeu(joueur);
        //Le joueur pioche une carte avant de jouer
        pioche.piocherCarte(joueur);

        //Afficher la main du joueur une seule fois
        affichage.afficherMain(joueur.getNom(), joueur.getNombreCartes(), joueur.getMain());

        //Recupérer le choix du joueur
        int choix = ((AffichageConsole) affichage).choisirCarte(joueur);
        
        while (choix < 0 || choix >= joueur.getMain().length || joueur.getMain()[choix] == null) {
            affichage.afficherChoixInvalide();
            choix = ((AffichageConsole) affichage).choisirCarte(joueur);
        }

        //Jouer la carte choisie
        Carte carteJouee = joueur.jouerCarte(choix);
        affichage.afficherJouerCarte(joueur, carteJouee);

        //Appliquer l'effet de la carte
        carteJouee.effetSpecial(joueur, adversaire);

        //Afficher les statistiques mises à jour
        affichage.afficherStats(joueur, adversaire);
    }

    
        

    public boolean estTermine() {
        return joueur1.getVie() <= 0 || joueur2.getVie() <= 0 ||
               joueur1.getPopularite() >= 5 || joueur2.getPopularite() >= 5;
    }
    
    public Joueur[] resultatJeu() {
        if (joueur1.getVie() <= 0 || joueur2.getPopularite() >= 5) {
            return new Joueur[]{ joueur2, joueur1 };
        } else {
            return new Joueur[]{ joueur1, joueur2 };
        }
    }


    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }
}
