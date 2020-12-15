package modele;

public class ElementA implements Element {
    @Override
    public void accept(Visiteur v) {
        v.visit(this);

    }
}
