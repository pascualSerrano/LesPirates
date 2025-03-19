package affichage;

import joueurs.Joueur;
import cartes.Carte;
import java.util.Scanner;
//Test Github
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
            scanner.next(); // Consomme l'entrée invalide
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

    @Override
    public void afficherMain(String nom, int nombreCartes, Carte main[]) {
        afficherMessage("\nMain de " + nom + ":");
        for (int i = 0; i < nombreCartes; i++) {
            afficherMessage(i + " - " + main[i].getNom());
        }
    }
}
