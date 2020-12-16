package exercice4.expressionsArithmetiques;

import exercice4.visiteurs.Visiteur;

public class Soustraction extends OperationBinaire {
    public Soustraction(ExpressionArithmétique expressionArithmétique1, ExpressionArithmétique expressionArithmétique2) {
        super(expressionArithmétique1, expressionArithmétique2);
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }
}
