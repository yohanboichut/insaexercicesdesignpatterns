package modele.etats;

import modele.Systeme;

public class Etat5 extends EtatSysteme {
    public Etat5(Systeme systeme) {
        super(systeme);
    }

    @Override
    public EtatSysteme evacuer() {
        getSysteme().setDispositifEvacuation(false);
        return new Etat0(getSysteme());
    }
}
