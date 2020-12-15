package exercice0.facade;

import exercice0.modele.Observateur;

public class CompteurEtourdissements implements Observateur {

    private int nbPoissons;
    private int nbPoissonsEtourdis;

    public int getNbPoissons() {
        return nbPoissons;
    }

    public int getNbPoissonsEtourdis() {
        return nbPoissonsEtourdis;
    }

    @Override
    public void notifier(TypeEvenement evenement) {
        if (evenement == TypeEvenement.ETOURDISSEMENT) {
            this.nbPoissonsEtourdis++;
        }
        if (evenement == TypeEvenement.NAISSANCE) {
            this.nbPoissons++;
        }
    }
}
