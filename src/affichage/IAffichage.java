package affichage;

//import java.util.Scanner;

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
    
    //Affichage Class Joueur
    void afficherMain(String nom, int nombreCartes, Carte main[]);
    
    //Affichage class Pioche
    void afficherPiocheVide();
    void afficherCartePiochee(Joueur joueur, Carte cartePiochee);
    
    //Affichage class Cartes Normales
    void afficherNormaleViePlus();
    void afficherNormaleVieMoins();
    void afficherNormalePopPlus();
    void afficherNormalePopMoins();
    
    //Affichage Cartes Spéciales
    void afficherMainDeFer(Joueur joueur);
    void afficherDiscoursInspirant(Joueur joueur, Joueur adversaire);
    void afficherCoupDeSabre(Joueur joueur, Joueur adversaire);
    void afficherAbordageReussi(Joueur joueur, Joueur adversaire);
}
