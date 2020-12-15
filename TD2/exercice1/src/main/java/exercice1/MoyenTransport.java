package exercice1;

import java.util.Objects;

public abstract class MoyenTransport implements Sujet {
    @Override
    public void enregistrerObservateur(Observateur o) {
        this.observateur = o;
    }

    private int deplacementMin;
    private int deplacementMax;
    private int x;
    private int y;


    private Observateur observateur;


    public MoyenTransport(int deplacementMin, int deplacementMax) {
        this.deplacementMin = deplacementMin;
        this.deplacementMax = deplacementMax;
    }


    public void deplacer(int x, int y) throws DeplacementImpossible {

        double distance = Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));

        if (distance <this.deplacementMin ||distance>this.deplacementMax ) {
            throw new DeplacementImpossible();
        }

        if (Objects.nonNull(observateur))
            this.observateur.notifierDeplacement(this,this.x, this.y, x,y);
        this.x = x;
        this.y = y;
    }


}
