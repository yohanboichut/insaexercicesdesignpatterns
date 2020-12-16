package exercice4.expressionsArithmetiques;

import exercice4.visiteurs.Visiteur;

public class ValeurNumerique implements ExpressionArithmétique {

    private double valeur;


    public ValeurNumerique(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }
}
