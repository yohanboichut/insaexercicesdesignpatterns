package exercice4;

import exercice4.expressionsArithmetiques.*;
import exercice4.visiteurs.Visiteur;
import exercice4.visiteurs.VisiteurEvaluation;
import exercice4.visiteurs.VisiteurRPN;

public class Main {

    public static void main(String[] args) {
        ExpressionArithmétique e = new Multiplication(new Addition(new ValeurNumerique(1),new ValeurNumerique(2)),
                new Soustraction(new ValeurNumerique(4),new ValeurNumerique(5)));


        VisiteurEvaluation visiteurEvaluation = new VisiteurEvaluation();
        e.accept(visiteurEvaluation);

        VisiteurRPN visiteurRPN = new VisiteurRPN();
        e.accept(visiteurRPN);

        System.out.println(visiteurRPN.getResultat()+":" +visiteurEvaluation.getResultat());
    }
}
