package modele;

import modele.etats.Etat0;
import modele.etats.EtatSysteme;

public class SystemeImpl implements Systeme {

    public enum Orientation {GAUCHE,DROITE};

    private boolean dispositifTransport;
    private boolean dispositifEvacuation;
    private Orientation orientationDispositifTransport;

    private EtatSysteme etatCourant;

    public SystemeImpl() {

        dispositifEvacuation = false;
        dispositifTransport = false;
        orientationDispositifTransport = Orientation.GAUCHE;
        etatCourant = new Etat0(this);
    }
    @Override
    public boolean isDispositifTransport() {
        return dispositifTransport;
    }
    @Override
    public void setDispositifTransport(boolean dispositifTransport) {
        this.dispositifTransport = dispositifTransport;
    }
    @Override
    public boolean isDispositifEvacuation() {
        return dispositifEvacuation;
    }
    @Override
    public void setDispositifEvacuation(boolean dispositifEvacuation) {
        this.dispositifEvacuation = dispositifEvacuation;
    }
    @Override
    public Orientation getOrientationDispositifTransport() {
        return orientationDispositifTransport;
    }
    @Override
    public void setOrientationDispositifTransport(Orientation orientationDispositifTransport) {
        this.orientationDispositifTransport = orientationDispositifTransport;
    }
    @Override
    public void charger(){
        this.etatCourant = this.etatCourant.charger();

    }
    @Override
    public void decharger(){
        this.etatCourant = this.etatCourant.decharger();
    }
    @Override
    public void evacuer(){
        this.etatCourant = this.etatCourant.evacuer();
    }
    @Override
    public void pivoter(){
        this.etatCourant = this.etatCourant.pivoter();
    }






}
