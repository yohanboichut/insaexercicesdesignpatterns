package exercice3.programme;

import exercice3.modele.arbres.ArbreFruitier;
import exercice3.modele.Hobbit;
import exercice3.modele.arbres.Cerisier;
import exercice3.modele.arbres.Poirier;
import exercice3.modele.arbres.Pommier;
import exercice3.modele.fruits.Fruit;

public class TheMain {
    public static void main(String[] args) {
        ArbreFruitier pommier = new Pommier();
        ArbreFruitier poirier = new Poirier();
        ArbreFruitier cerisier = new Cerisier();
        Hobbit maraudeur = new Hobbit("Merry");
        maraudeur.mange(pommier.cueille());
        maraudeur.mange(poirier.cueille());
        maraudeur.mange(cerisier.cueille());

    }
}

