package canards.modele;

import canards.modele.comportementsCancanement.CoinCoin;
import canards.modele.comportementsCancanement.CouicCouic;
import canards.modele.comportementsVols.VolAvecLesAiles;

public class Colvert extends Canard {

    public Colvert() {
        super(new VolAvecLesAiles(),new CoinCoin());
    }
    public void afficher() {
        System.out.println("Je suis un Colvert !!!");
    }
}
