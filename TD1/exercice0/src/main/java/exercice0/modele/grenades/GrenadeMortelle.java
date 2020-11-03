package exercice0.modele.grenades;

import exercice0.modele.poissons.DeplacementMort;
import exercice0.modele.poissons.Poisson;

public class GrenadeMortelle extends Grenade {

    public GrenadeMortelle(int rayon, int x, int y) {
        super(rayon, x, y);
    }

    @Override
    public void impact(Poisson poisson) {
        int deltaX = poisson.getX()-this.getX();
        int deltaY = poisson.getY()-this.getY();
        double distancePoissonImpact = Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
        if (distancePoissonImpact <= getRayon()) {
            poisson.setComportementDeplacement(new DeplacementMort());
        }
    }
}
