package exercice0.modele.poissons;


import exercice0.modele.Observateur;
import exercice0.modele.Sujet;
import exercice0.modele.mare.Mare;
import exercice0.modele.mare.PoissonOutOfBoundException;

import java.util.ArrayList;
import java.util.Collection;

public class Poisson implements Sujet {

    /**
     * Mare dans laquelle est censé être le poisson
     */
    private Mare mare;
    /**
     * Position en x du poisson
     */
    private int x;
    /**
     * Position en y du poisson
     */
    private int y;


    private ComportementDeplacement comportementDeplacement;


    private Collection<Observateur> observateur;
    /**
     * Sens de déplacement du poisson
     */
    private int sensDeplacement;

    public Poisson(int x, int y, Mare mare, Observateur... observateurs) {
        this.x = x;
        this.y = y;
        this.sensDeplacement = 1;
        this.observateur = new ArrayList<>();
        for (Observateur o : observateurs) {
            this.enregistrerObservateur(o);
        }

        try {
            this.notifierAll(Observateur.TypeEvenement.NAISSANCE);
            mare.ajouterPoisson(this);
            this.comportementDeplacement = new DeplacementNormal(this);
        } catch (PoissonOutOfBoundException e) {
            this.comportementDeplacement = new DeplacementMort(this);
        }
        this.mare = mare;
    }



    public void setMare(Mare mare) {
        this.mare = mare;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Mare getMare() {
        return mare;
    }

    public void setSensDeplacement(int sensDeplacement) {
        this.sensDeplacement = sensDeplacement;
    }

    public int getSensDeplacement() {
        return sensDeplacement;
    }

    public void setComportementDeplacement(ComportementDeplacement comportementDeplacement) {
        this.comportementDeplacement = comportementDeplacement;
    }

    /**
     * Permet de faire un déplacement du poisson. Si le poisson arrive à une extrémité, il fait demi-tour.
     */

    public void deplacer() {
        this.comportementDeplacement.deplacer();
    }

    @Override
    public String toString() {
        return "Poisson{" +
                "x=" + x +
                ", y=" + y +
                ", sensDeplacement=" + sensDeplacement +
                '}';
    }

    @Override
    public void enregistrerObservateur(Observateur observateur) {
        this.observateur.add(observateur);
    }

    @Override
    public void notifierAll(Observateur.TypeEvenement evenement) {
        for(Observateur o : this.observateur)
            o.notifier(evenement);
    }


}
