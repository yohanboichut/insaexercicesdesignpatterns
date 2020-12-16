package exercice4.expressionsArithmetiques;

import exercice4.visiteurs.Visiteur;

public class Multiplication extends OperationBinaire {
    public Multiplication(ExpressionArithmétique expressionArithmétique1, ExpressionArithmétique expressionArithmétique2) {
        super(expressionArithmétique1, expressionArithmétique2);
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }
}
