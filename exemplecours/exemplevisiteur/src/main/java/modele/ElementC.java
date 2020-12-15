package modele;

public class ElementC implements Element {
    @Override
    public void accept(Visiteur v) {
        v.visit(this);

    }
}
