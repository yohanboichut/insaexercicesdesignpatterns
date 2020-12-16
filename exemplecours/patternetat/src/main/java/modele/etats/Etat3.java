package modele.etats;

import modele.Systeme;
import modele.SystemeImpl;

public class Etat3 extends EtatSysteme {
    public Etat3(Systeme systeme) {
        super(systeme);
    }

    @Override
    public EtatSysteme evacuer() {
        getSysteme().setDispositifEvacuation(false);
        return new Etat4(getSysteme());
    }

    @Override
    public EtatSysteme pivoter() {
        getSysteme().setOrientationDispositifTransport(SystemeImpl.Orientation.GAUCHE);
        return new Etat5(getSysteme());
    }
}
