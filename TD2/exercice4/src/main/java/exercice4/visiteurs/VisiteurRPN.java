package exercice4.visiteurs;

import exercice4.expressionsArithmetiques.*;

public class VisiteurRPN implements Visiteur {

    private String resultat;

    public String getResultat() {
        return resultat;
    }

    private String dive(ExpressionArithmétique e) {
        VisiteurRPN v = new VisiteurRPN();
        e.accept(v);
        return v.getResultat();
    }

    @Override
    public void visit(Addition addition) {
        resultat = "(+ "+ dive(addition.getExpressionArithmétique1()) +" "+ dive(addition.getExpressionArithmétique2())+")";
    }

    @Override
    public void visit(Division e) {
        resultat = "(/ "+ dive(e.getExpressionArithmétique1()) +" "+ dive(e.getExpressionArithmétique2())+")";
    }

    @Override
    public void visit(Soustraction e) {
        resultat = "(- "+ dive(e.getExpressionArithmétique1()) +" "+ dive(e.getExpressionArithmétique2())+")";

    }

    @Override
    public void visit(Multiplication e) {
        resultat = "(* "+ dive(e.getExpressionArithmétique1()) +" "+ dive(e.getExpressionArithmétique2())+")";


    }

    @Override
    public void visit(ValeurNumerique e) {

        resultat = Double.toString(e.getValeur());
    }
}
