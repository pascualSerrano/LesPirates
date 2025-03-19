package cartes;

import joueurs.Joueur;

public abstract class Carte {
    protected String nom;
    protected Type type;

    public Carte(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }

    protected void appliquerEffet(Joueur joueur, Joueur adversaire, int modifPopJoueur, int modifPopAdversaire, int modifVieJoueur, int modifVieAdversaire) {
        joueur.modifPop(modifPopJoueur);
        adversaire.modifPop(modifPopAdversaire);
        joueur.modifVie(modifVieJoueur);
        adversaire.modifVie(modifVieAdversaire);
    }

    public abstract void effetSpecial(Joueur joueur, Joueur adversaire);
}
