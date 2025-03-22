package affichage;

import joueurs.Joueur;
import cartes.Carte;
import java.util.Scanner;


public class AffichageConsole implements IAffichage {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void afficherMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherFin(Joueur gagnant, Joueur perdant) {
        System.out.println("\n🎉 " + gagnant.getNom() + " gagne ! 🏴‍☠️ " + perdant.getNom() + " doit cacher son trésor !");
    }

    @Override
    public int choisirCarte(Joueur joueur) {
        afficherMessage(joueur.getNom() + ", entre l'index de la carte que tu veux jouer : ");
        int choix = -1;
        while (!scanner.hasNextInt()) {
            afficherMessage("❌ Entrée invalide. Veuillez entrer un nombre.");
            scanner.next(); 
        }
        choix = scanner.nextInt();
        return choix;
    }
    
    
    //Affichage Class Jeu
    @Override
    public void afficherDebutJeu() {
    	afficherMessage("🎲 Début du jeu Les Pirates !");
    	afficherMessage("🃏 Distribution des cartes initiales...");
    }
    
    @Override
    public void afficherTourJeu(Joueur joueur) {
    	afficherMessage("\n🔄 Tour de " + joueur.getNom());
    }
    
    @Override
    public void afficherChoixInvalide() {
    	afficherMessage("❌ Choix invalide, veuillez réessayer.");
    }
    
    @Override
    public void afficherJouerCarte(Joueur joueur, Carte carteJouee){
    	afficherMessage(joueur.getNom() + " joue la carte " + carteJouee.getNom());
    }
    
    @Override
    public void afficherStats(Joueur joueur, Joueur adversaire) {
        afficherMessage("\n📊 Statistiques des joueurs après l'action :");
        afficherMessage(joueur.getNom() + " → Vie : " + joueur.getVie() + " | Popularité : " + joueur.getPopularite());
        afficherMessage(adversaire.getNom() + " → Vie : " + adversaire.getVie() + " | Popularité : " + adversaire.getPopularite());
    }
    
    //Affichage de la classe Joueur
    @Override
    public void afficherMain(String nom, int nombreCartes, Carte main[]) {
        afficherMessage("\nMain de " + nom + ":");
        for (int i = 0; i < nombreCartes; i++) {
            afficherMessage(i + " - " + main[i].getNom());
        }
    }
    
    //Affichage class Joueur
    @Override
    public void afficherPiocheVide() {
    	afficherMessage("La pioche est vide !");
    }
    
    @Override
    public void afficherCartePiochee(Joueur joueur, Carte cartePiochee) {
    	afficherMessage(joueur.getNom() + " pioche la carte : " + cartePiochee.getNom());
    }
    
    //Affichage class Cartes Normales
    @Override
    public void afficherNormaleViePlus() {
    	afficherMessage("Timoners, virez babord, On répare la grande voile!");
    }
    
    @Override
    public void afficherNormaleVieMoins() {
    	afficherMessage("Frappez fort mes boucaniers!");
    }
    
    @Override 
    public void afficherNormalePopPlus() {
    	afficherMessage("Sacrés matelots, ils me croient quand je leurs dis on va gagner hahaha!");
    }
    
    @Override
    public void afficherNormalePopMoins() {
    	afficherMessage("Pirates d'eaux douces... pirates en voie de disparition!");
    }
    
    //Affichage Cartes Spéciales
    @Override
    public void afficherMainDeFer(Joueur joueur) {
    	afficherMessage("Belle droite " + joueur.getNom() + "!");
    }
    
    @Override
    public void afficherDiscoursInspirant(Joueur joueur, Joueur adversaire) {
    	afficherMessage("Les belles paroles du mousaillon " + joueur.getNom() + " encouragent sa tripulation et font peur au pirates du maintenant effrayé " + adversaire.getNom() + ".");
    }
    
    @Override
    public void afficherCoupDeSabre(Joueur joueur, Joueur adversaire) {
    	afficherMessage("La lame du reconnu " + joueur.getNom() + " percute sans pitié le flibustier " + adversaire.getNom() +"!");
    }
    
    @Override
    public void afficherAbordageReussi(Joueur joueur, Joueur adversaire) {
    	afficherMessage("\n" + joueur.getNom() + " a sauté sur le bateau du terrible " + adversaire.getNom() + "... Pauvre pirate.");
    }
}
