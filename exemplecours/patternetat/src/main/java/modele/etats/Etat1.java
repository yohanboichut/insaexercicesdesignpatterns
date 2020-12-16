package modele.etats;

import modele.Systeme;
import modele.SystemeImpl;

public class Etat1 extends EtatSysteme {
    public Etat1(Systeme systeme) {
        super(systeme);
    }


    @Override
    public EtatSysteme pivoter() {
        this.getSysteme().setOrientationDispositifTransport(SystemeImpl.Orientation.DROITE);
        return new Etat2(getSysteme());
    }
}
