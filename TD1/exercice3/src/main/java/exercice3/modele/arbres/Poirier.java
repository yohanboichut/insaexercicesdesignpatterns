package exercice3.modele.arbres;

import exercice3.modele.fruits.Fruit;
import exercice3.modele.fruits.Poire;
import exercice3.modele.fruits.Pomme;

public class Poirier extends ArbreFruitier{

    private static final String TYPE = "Poirier";

    public Poirier() {
        super(TYPE);
    }

    @Override
    public Fruit creerFruit() {
        return new Poire();
    }
}
