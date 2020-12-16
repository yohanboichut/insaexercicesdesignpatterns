package exercice4.expressionsArithmetiques;

public abstract class OperationBinaire implements ExpressionArithmétique {


    private ExpressionArithmétique expressionArithmétique1;
    private ExpressionArithmétique expressionArithmétique2;

    public OperationBinaire(ExpressionArithmétique expressionArithmétique1, ExpressionArithmétique expressionArithmétique2) {
        this.expressionArithmétique1 = expressionArithmétique1;
        this.expressionArithmétique2 = expressionArithmétique2;
    }


    public ExpressionArithmétique getExpressionArithmétique1() {
        return expressionArithmétique1;
    }

    public ExpressionArithmétique getExpressionArithmétique2() {
        return expressionArithmétique2;
    }
}
