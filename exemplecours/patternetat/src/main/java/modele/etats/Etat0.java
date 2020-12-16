package modele.etats;

import modele.Systeme;

public class Etat0 extends EtatSysteme {
    public Etat0(Systeme systeme) {
        super(systeme);
    }

    @Override
    public EtatSysteme charger() {
        this.getSysteme().setDispositifTransport(true);
        return new Etat1(getSysteme());
    }
}
