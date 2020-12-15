package exercice0.modele;

public interface Sujet {

    void enregistrerObservateur(Observateur observateur);
    void notifierAll(Observateur.TypeEvenement evenement);
}
