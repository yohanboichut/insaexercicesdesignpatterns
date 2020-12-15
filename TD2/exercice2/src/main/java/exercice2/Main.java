package exercice2;

import exercice2.modele.Personne;
import exercice2.modele.PersonneImpl;
import exercice2.modele.PersonneMasquee;

public class Main {


    public static void main(String[] args) {
        Personne yohan = new PersonneImpl("Boichut", "Yohan");

        PersonneMasquee yohanMasque = new PersonneMasquee(yohan);


        yohanMasque.sortir();

    }
}
