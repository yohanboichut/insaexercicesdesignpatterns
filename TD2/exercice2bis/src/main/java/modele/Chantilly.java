package modele;

public class Chantilly extends DecorateurIngredient {
    public Chantilly(Boisson boissonDecoree) {
        super(boissonDecoree);
    }

    @Override
    public double getCout() {
        return 0.1+ this.getBoissonDecoree().getCout();
    }


}
