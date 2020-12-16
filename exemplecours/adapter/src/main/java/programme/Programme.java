package programme;

import modele.AdapterCanard;
import modele.Animal;
import modele.Canard;
import modele.Chien;

import java.util.ArrayList;
import java.util.Collection;

public class Programme {

    public static void main(String[] args) {
        Animal chien = new Chien();

        Canard canard = new Canard();


        Collection<Animal> animaux = new ArrayList<>();
        animaux.add(chien);
        animaux.add(new AdapterCanard(canard));

        for (Animal a : animaux) {
            a.crier();
            a.deplacer();
        }
    }
}
