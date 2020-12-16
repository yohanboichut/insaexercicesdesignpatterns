package exercice4.visiteurs;

import exercice4.expressionsArithmetiques.*;

public interface Visiteur {

    void visit(Addition addition);
    void visit(Division division);
    void visit(Soustraction soustraction);
    void visit(Multiplication multiplication);
    void visit(ValeurNumerique valeurNumerique);

}
