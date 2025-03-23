package cartes;

public enum Type {
    NORMALE_POP_PLUS(9),
    NORMALE_POP_MOINS(9),
    NORMALE_VIE_PLUS(9),
    NORMALE_VIE_MOINS(9),
    MAIN_DE_FER(4),
    DISCOURS_INSPIRANT(4),
    ABORDAGE_REUSSI(3),
    COUP_DE_SABRE(5);

    private int nombre;

    Type(int nombre) {
        this.nombre = nombre;
    }

    public int getNombre() {
        return nombre;
    }
}

