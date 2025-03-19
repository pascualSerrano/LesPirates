package affichage;

import joueurs.Joueur;


public interface IAffichage {
    void afficherMessage(String message);
    void afficherFin(Joueur gagnant, Joueur perdant);
    int choisirCarte(Joueur joueur);
}
