package modele;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boissonDecoree) {
        super(boissonDecoree);
    }

    @Override
    public double getCout() {
        return 0.2+ this.getBoissonDecoree().getCout();
    }


}
