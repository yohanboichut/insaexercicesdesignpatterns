package canards.application;

import canards.modele.Canard;
import canards.modele.CanardEnPlastique;
import canards.modele.Colvert;
import canards.modele.Mandarin;
import canards.modele.comportementsCancanement.CouicCouic;
import canards.modele.comportementsVols.VolAvecLesAiles;

public class Programme {

    public static void main(String[] args) {
        Canard colvert = new Colvert();
        Canard mandarin = new Mandarin();
        Canard canardEnPlastique = new CanardEnPlastique();

        Canard[] troupe = new Canard[]{colvert,mandarin,canardEnPlastique};


        for (Canard c : troupe) {
            System.out.println("----------------------");
            c.afficher();
            c.voler();
            c.cancaner();
            System.out.println("----------------------");
        }


    }
}
