package joueurs;

import cartes.Carte;
import affichage.IAffichage;
import affichage.AffichageConsole;

public class Joueur {
    private String nom;
    private int vie;
    private int popularite;
    private Carte[] main;
    private int nombreCartes;
    private IAffichage affichage; // ✅ Ajout de l'affichage

    public Joueur(String nom) {
        this.nom = nom;
        this.vie = 5;
        this.popularite = 0;
        this.main = new Carte[5];
        this.nombreCartes = 0;
        this.affichage = new AffichageConsole(); // ✅ Initialisation correcte de l'affichage
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public int getPopularite() {
        return popularite;
    }

    public void modifVie(int valeur) {
        vie += valeur;
        if (vie < 0) vie = 0;
    }

    public void modifPop(int valeur) {
        popularite += valeur;
    }

    public void ajouterCarte(Carte carte) {
        if (nombreCartes < main.length) {
            main[nombreCartes++] = carte;
        }
    }

    // ✅ Correction : Utilisation d’une instance `affichage`
    public void afficherMain() {
        affichage.afficherMessage("\nMain de " + nom + ":");
        for (int i = 0; i < nombreCartes; i++) {
            affichage.afficherMessage(i + " - " + main[i].getNom());
        }
    }

    public Carte[] getMain() {
        return main;
    }

    public Carte jouerCarte(int index) {
        if (index < 0 || index >= nombreCartes) {
            affichage.afficherMessage("⚠ Erreur : Index invalide !");
            return null;
        }

        Carte carteJouee = main[index];

        for (int i = index; i < nombreCartes - 1; i++) {
            main[i] = main[i + 1];
        }
        main[--nombreCartes] = null;

        return carteJouee;
    }
}
