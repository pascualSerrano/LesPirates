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
    private IAffichage affichage;

    public Joueur(String nom) {
        this.nom = nom;
        this.vie = 5;
        this.popularite = 0;
        this.main = new Carte[5];
        this.nombreCartes = 0;
        this.affichage = new AffichageConsole();
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }
    
    public int getNombreCartes() {
    	return nombreCartes;
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

    public Carte[] getMain() {
        return main;
    }
    
    public Carte jouerCarte(int index) {
        if (index < 0 || index >= nombreCartes) {
            affichage.afficherChoixInvalide();
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
