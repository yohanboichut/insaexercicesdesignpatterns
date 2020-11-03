package canards.modele;

import canards.modele.comportementsCancanement.CoinCoin;
import canards.modele.comportementsVols.VolAvecLesAiles;

public class Mandarin extends Canard {

    public Mandarin() {
        super(new VolAvecLesAiles(),new CoinCoin());
    }
    public void afficher() {
        System.out.println("Je suis un Mandarin !!!");
    }
}
