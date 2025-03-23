package cartes;

import joueurs.Joueur;
import affichage.AffichageConsole;
import affichage.IAffichage;

public abstract class Carte {
    protected String nom;
    protected Type type;
    protected  static IAffichage affichage;

    public Carte(String nom, Type type) {
        this.nom = nom;
        this.type = type;
        affichage = new AffichageConsole();
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }
    
    public static Carte jouerCarte(int index, int nombreCartes, Carte main[], Joueur joueur) {
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

    protected void appliquerEffet(Joueur joueur, Joueur adversaire, int modifPopJoueur, int modifPopAdversaire, int modifVieJoueur, int modifVieAdversaire) {
        joueur.modifPop(modifPopJoueur);
        adversaire.modifPop(modifPopAdversaire);
        joueur.modifVie(modifVieJoueur);
        adversaire.modifVie(modifVieAdversaire);
    }

    public abstract void effetSpecial(Joueur joueur, Joueur adversaire);
}
