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
        affichage.afficherMessage("🃏 Distribution des cartes initiales...");
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
        affichage.afficherMessage("\n🔄 Tour de " + joueur.getNom());

        // ✅ Le joueur pioche une carte avant de jouer
        pioche.piocherCarte(joueur);

        // ✅ Afficher la main du joueur une seule fois
        joueur.afficherMain();

        // ✅ Vérifier le choix du joueur
        int choix = ((AffichageConsole) affichage).choisirCarte(joueur);
        while (choix < 0 || choix >= joueur.getMain().length || joueur.getMain()[choix] == null) {
            affichage.afficherMessage("❌ Choix invalide, veuillez réessayer.");
            choix = ((AffichageConsole) affichage).choisirCarte(joueur);
        }

        // ✅ Jouer la carte choisie
        Carte carteJouee = joueur.jouerCarte(choix);
        affichage.afficherMessage(joueur.getNom() + " joue la carte " + carteJouee.getNom());

        // ✅ Appliquer l'effet de la carte
        carteJouee.effetSpecial(joueur, adversaire);

        // ✅ Afficher les statistiques mises à jour
        afficherStats(joueur, adversaire);
    }

    private void afficherStats(Joueur joueur, Joueur adversaire) {
        affichage.afficherMessage("\n📊 Statistiques des joueurs après l'action :");
        affichage.afficherMessage(joueur.getNom() + " → Vie : " + joueur.getVie() + " | Popularité : " + joueur.getPopularite());
        affichage.afficherMessage(adversaire.getNom() + " → Vie : " + adversaire.getVie() + " | Popularité : " + adversaire.getPopularite());
    }

    public boolean estTermine() {
        return joueur1.getVie() <= 0 || joueur2.getVie() <= 0 ||
               joueur1.getPopularite() >= 5 || joueur2.getPopularite() >= 5;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }
}
