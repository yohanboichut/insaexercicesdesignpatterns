package exercice3.modele.arbres;

import exercice3.modele.fruits.Fruit;
import exercice3.modele.fruits.Pomme;

public class Pommier extends ArbreFruitier{

    private static final String TYPE = "Pommier";

    public Pommier() {
        super(TYPE);
    }

    @Override
    public Fruit creerFruit() {
        return new Pomme();
    }
}
