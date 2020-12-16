package modele.etats;

import modele.Systeme;
import modele.SystemeImpl;

public class Etat2 extends EtatSysteme {
    public Etat2(Systeme systeme) {
        super(systeme);
    }

    @Override
    public EtatSysteme decharger() {
        getSysteme().setDispositifTransport(false);
        getSysteme().setDispositifEvacuation(true);
        return new Etat3(getSysteme());
    }

    @Override
    public EtatSysteme pivoter() {
        getSysteme().setOrientationDispositifTransport(SystemeImpl.Orientation.GAUCHE);
        return new Etat1(getSysteme());
    }
}
