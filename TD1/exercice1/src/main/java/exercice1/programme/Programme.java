package exercice1.programme;

import exercice1.facade.FacadePanier;
import exercice1.modele.Corrige;
import exercice1.modele.paiement.MoyenPaiement;
import exercice1.modele.paiement.MoyenPaiementCB;
import exercice1.modele.paiement.MoyenPaiementPayPal;

public class Programme {
    public static void main(String[] args) {

        FacadePanier facadePanier = new FacadePanier();

        Corrige corrige1 = new Corrige(12);
        Corrige corrige2 = new Corrige(13);
        Corrige corrige3 = new Corrige(14);

        facadePanier.ajouterCorrigesAuPanier(corrige1,corrige2,corrige3);

        MoyenPaiement paiement = new
                MoyenPaiementPayPal("yohan.boichut@univ-orleans.fr",
                "1234");

        MoyenPaiement paiement1 = new
                MoyenPaiementCB("Boichut","132456456","1234","01/21");

        facadePanier.payer(paiement1);


    }
}
