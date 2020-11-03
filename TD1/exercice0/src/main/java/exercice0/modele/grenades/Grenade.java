package exercice0.modele.grenades;

import exercice0.modele.poissons.DeplacementMort;
import exercice0.modele.poissons.Poisson;

public abstract class Grenade {

    private int rayon;
    private int x;
    private int y;

    public Grenade(int rayon, int x, int y) {
        this.rayon = rayon;
        this.x = x;
        this.y =y;
    }


    public int getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void impact(Poisson poisson);
    /**
    {

    }*/
}
