package exercice0.modele.mare;

import exercice0.modele.poissons.Poisson;

import java.util.ArrayList;
import java.util.Collection;

public class Mare {

    /**
     * Tous les poissons concernés par cette exercice0.modele.mare
     */
    private Collection<Poisson> poissons;

    /**
     * Longueur de la exercice0.modele.mare. Cela implique des coordonnées en x variant de 0 à dimX pour les poissons
     */
    private int dimX;

    /**
     * Largeur de la exercice0.modele.mare. Cela implique des coordonnées en y variant de 0 à dimY pour les poissons
     */

    private int dimY;

    public int getDimX() {
        return dimX;
    }

    public int getDimY() {
        return dimY;
    }

    public Mare(int dimX, int dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
        this.poissons = new ArrayList<Poisson>();
    }

    /**
     * Permet d'ajouter un poisson dans la exercice0.modele.mare
     * @param poisson
     * @throws PoissonOutOfBoundException : le poisson est en dehors de l'eau, il doit donc mourir
     */
    public void ajouterPoisson(Poisson poisson) throws PoissonOutOfBoundException {
        if (poisson.getX()>=0 && poisson.getX()<= dimX) {
            this.poissons.add(poisson);
        }
        else    {
            throw new PoissonOutOfBoundException();
        }
    }

    /**
     * Permet de mettre à jour toutes les positions des poissons
     */

    public void majPositionPoissons() {
        poissons.stream().forEach(e -> e.deplacer());


    }

    /**
     * Permet de récupérer les poissons concernés par la exercice0.modele.mare
     * @return les poissons
     */
    public Collection<Poisson> getPoissons() {
        return poissons;
    }
}
