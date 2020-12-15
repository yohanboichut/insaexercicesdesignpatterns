package exercice0.modele;

public interface Observateur {
    enum TypeEvenement {MORT,NAISSANCE,ETOURDISSEMENT}

    void notifier(TypeEvenement evenement);

}
