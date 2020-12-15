package modele;

public class Sumatra implements Boisson {

    private static double PRIX = 0.99;




    public Sumatra() {
    }


    @Override
    public double getCout() {
        return PRIX;
    }
}
