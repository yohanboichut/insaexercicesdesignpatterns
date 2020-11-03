package exercice0.modele.poissons;

import exercice0.modele.poissons.ComportementDeplacement;

public class DeplacementEtourdi implements ComportementDeplacement {

    private Poisson poisson;


    private long nbToursEtourdi = 1000;

    public DeplacementEtourdi(Poisson poisson) {
        this.poisson = poisson;
    }

    @Override
    public void deplacer() {
        if (nbToursEtourdi ==0) {
            poisson.setComportementDeplacement(new DeplacementNormal(poisson));
        }
        else {
            nbToursEtourdi--;
        }

    }
}
