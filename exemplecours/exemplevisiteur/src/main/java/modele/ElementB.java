package modele;

import java.util.Collection;

public class ElementB implements Element {

    private Collection<Element> elements;

    public ElementB(Collection<Element> elements) {
        this.elements = elements;
    }

    public Collection<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);

    }
}
