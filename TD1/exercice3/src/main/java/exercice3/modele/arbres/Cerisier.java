package exercice3.modele.arbres;

import exercice3.modele.fruits.Cerise;
import exercice3.modele.fruits.Fruit;
import exercice3.modele.fruits.Poire;

public class Cerisier extends ArbreFruitier{

    private static final String TYPE = "Cerisier";

    public Cerisier() {
        super(TYPE);
    }

    @Override
    public Fruit creerFruit() {
        return new Cerise();
    }
}
