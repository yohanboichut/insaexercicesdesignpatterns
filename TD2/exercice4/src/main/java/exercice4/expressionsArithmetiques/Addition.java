package exercice4.expressionsArithmetiques;

import exercice4.visiteurs.Visiteur;

public class Addition extends OperationBinaire {
    public Addition(ExpressionArithmétique expressionArithmétique1, ExpressionArithmétique expressionArithmétique2) {
        super(expressionArithmétique1, expressionArithmétique2);
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }
}
