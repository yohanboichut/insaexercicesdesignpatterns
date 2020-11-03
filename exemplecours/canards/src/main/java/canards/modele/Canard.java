package canards.modele;

import canards.modele.comportementsCancanement.ComportementCancanement;
import canards.modele.comportementsVols.ComportementVol;

public abstract class Canard {
    private ComportementVol comportementVol;

    private ComportementCancanement comportementCancanement;


    public Canard(ComportementVol comportementVol, ComportementCancanement comportementCancanement) {
        this.comportementVol = comportementVol;
        this.comportementCancanement = comportementCancanement;
    }

    public void cancaner(){

        comportementCancanement.cancaner();
    }

    public void voler() {

        comportementVol.voler();
    }

    public void nager() {
        System.out.println("Je nage!!");
    }

    public abstract void afficher();
}
