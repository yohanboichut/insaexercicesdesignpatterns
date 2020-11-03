package exercice3.modele;

import exercice3.modele.fruits.Fruit;

public class Hobbit {
    String nom;
    public Hobbit(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void mange(Fruit cueille) {
        System.out.println(nom + " mange " +cueille.getNomFruit());
    }
}
