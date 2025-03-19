package affichage;

import cartes.Carte;
import joueurs.Joueur;


public interface IAffichage {
    void afficherMessage(String message);
    void afficherFin(Joueur gagnant, Joueur perdant);
    int choisirCarte(Joueur joueur);
    
    //Affichage Class Jeu
    void afficherDebutJeu();
    void afficherTourJeu(Joueur joueur);
    void afficherChoixInvalide();
    void afficherJouerCarte(Joueur joueur, Carte carteJouee);
    void afficherStats(Joueur joueur, Joueur adversaire);
    
    //Affichage Class 
    void afficherMain(String nom, int nombreCartes, Carte main[]);
}
