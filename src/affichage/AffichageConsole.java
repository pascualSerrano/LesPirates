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
}
