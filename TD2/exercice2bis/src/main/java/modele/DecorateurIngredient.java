package modele;

public abstract class DecorateurIngredient implements Boisson {

    private Boisson boissonDecoree;

    public DecorateurIngredient(Boisson boissonDecoree) {
        this.boissonDecoree = boissonDecoree;
    }

    public Boisson getBoissonDecoree() {
        return boissonDecoree;
    }
}
