package exercice4.visiteurs;

import exercice4.expressionsArithmetiques.*;

public class VisiteurEvaluation implements Visiteur {

    private double resultat;

    public double getResultat() {
        return resultat;
    }

    private double dive(ExpressionArithmétique e) {
        VisiteurEvaluation v = new VisiteurEvaluation();
        e.accept(v);
        return v.getResultat();
    }

    @Override
    public void visit(Addition addition) {
        resultat = dive(addition.getExpressionArithmétique1()) + dive(addition.getExpressionArithmétique2());
    }

    @Override
    public void visit(Division division) {
        resultat = dive(division.getExpressionArithmétique1()) / dive(division.getExpressionArithmétique2());

    }

    @Override
    public void visit(Soustraction soustraction) {
        resultat = dive(soustraction.getExpressionArithmétique1()) - dive(soustraction.getExpressionArithmétique2());
    }

    @Override
    public void visit(Multiplication multiplication) {
        resultat = dive(multiplication.getExpressionArithmétique1()) * dive(multiplication.getExpressionArithmétique2());

    }

    @Override
    public void visit(ValeurNumerique valeurNumerique) {
        resultat = valeurNumerique.getValeur();
    }
}
