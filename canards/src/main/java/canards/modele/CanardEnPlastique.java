package canards.modele;

import canards.modele.comportementsCancanement.CoinCoin;
import canards.modele.comportementsCancanement.CouicCouic;
import canards.modele.comportementsVols.VolAvecLesAiles;
import canards.modele.comportementsVols.VolePas;

public class CanardEnPlastique extends Canard {

    public CanardEnPlastique() {
        super(new VolePas(),new CouicCouic());
    }

    public void afficher() {
        System.out.println("Je suis un canard en plastique !!!");
    }
}
