package modele;

public class Chien implements Animal {
    @Override
    public void deplacer() {
        System.out.println("Le chien court");
    }

    @Override
    public void crier() {
        System.out.println("ouaf ouaf");
    }
}
