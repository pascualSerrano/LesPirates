package cartes;

import joueurs.Joueur;
import affichage.AffichageConsole;
import affichage.IAffichage;
import java.util.Random;

public class Pioche {
    private Carte[] cartes;
    private int indexPioche;
    private IAffichage affichage; 

    public Pioche() {
        genererPioche();
        melangerPioche();
        indexPioche = 0;
        affichage = new AffichageConsole();
    }

    private void genererPioche() {
        int taillePioche = 0;
        for (Type type : Type.values()) {
            taillePioche += type.getNombre();
        }

        cartes = new Carte[taillePioche];
        int index = 0;

        for (Type type : Type.values()) {
            for (int i = 0; i < type.getNombre(); i++) {
                switch (type) {
                    case NORMALE_POP_PLUS:
                        cartes[index++] = new NormalePopPlus();
                        break;
                    case NORMALE_POP_MOINS:
                        cartes[index++] = new NormalePopMoins();
                        break;
                    case NORMALE_VIE_PLUS:
                        cartes[index++] = new NormaleViePlus();
                        break;
                    case NORMALE_VIE_MOINS:
                        cartes[index++] = new NormaleVieMoins();
                        break;
                    case MAIN_DE_FER:
                        cartes[index++] = new MainDeFer();
                        break;
                    case DISCOURS_INSPIRANT:
                        cartes[index++] = new DiscoursInspirant();
                        break;
                    case ABORDAGE_REUSSI:
                        cartes[index++] = new AbordageReussi();
                        break;
                    case COUP_DE_SABRE:
                        cartes[index++] = new CoupDeSabre();
                        break;
                }
            }
        }
    }

    private void melangerPioche() {
        Random rand = new Random();
        for (int i = cartes.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Carte temp = cartes[i];
            cartes[i] = cartes[j];
            cartes[j] = temp;
        }
    }

    public void piocherCarte(Joueur joueur) {
        if (indexPioche < cartes.length) {
            Carte cartePiochee = cartes[indexPioche++];
            joueur.ajouterCarte(cartePiochee);
            affichage.afficherCartePiochee(joueur, cartePiochee);
        } else {
            affichage.afficherPiocheVide();
        }
    }
}


