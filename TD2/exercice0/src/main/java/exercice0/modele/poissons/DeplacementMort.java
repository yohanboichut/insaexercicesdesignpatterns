package exercice0.modele.poissons;

import exercice0.modele.Observateur;

public class DeplacementMort implements ComportementDeplacement{

    private Poisson poisson;


    public DeplacementMort(Poisson poisson) {
        this.poisson = poisson;
        this.poisson.notifierAll(Observateur.TypeEvenement.MORT);
    }

    @Override
    public void deplacer() {

    }
}
