package exercice3.modele.fruits;

public abstract class Fruit {
    private String nomFruit;

    public Fruit(String nomFruit) {
        this.nomFruit = nomFruit;
    }

    public String getNomFruit() {
        return nomFruit;
    }
}
