package exercice3.modele.arbres;

import exercice3.modele.fruits.Fruit;

public abstract class ArbreFruitier {
    private String type;
    public ArbreFruitier(String type) {
        this.type = type;
    }

    public abstract Fruit creerFruit();


    public Fruit cueille() {
        return creerFruit();
    }
    public String toString() {
        return this.type;
    }
}
