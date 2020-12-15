package exercice0.facade;

import exercice0.modele.Observateur;

public class CompteurMorts implements Observateur {

    private int nbPoissons;
    private int nbMorts;

    public int getNbPoissons() {
        return nbPoissons;
    }

    public int getNbMorts() {
        return nbMorts;
    }

    @Override
    public void notifier(TypeEvenement evenement) {
        if (evenement == TypeEvenement.MORT) {
            this.nbMorts++;
        }
        if (evenement == TypeEvenement.NAISSANCE) {
            this.nbPoissons++;
        }
    }

}
