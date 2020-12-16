package modele.etats;

import modele.Systeme;
import modele.SystemeImpl;

public class Etat4 extends EtatSysteme {
    public Etat4(Systeme systeme) {
        super(systeme);
    }

    @Override
    public EtatSysteme pivoter() {
        getSysteme().setOrientationDispositifTransport(SystemeImpl.Orientation.GAUCHE);
        return new Etat0(getSysteme());
    }
}
