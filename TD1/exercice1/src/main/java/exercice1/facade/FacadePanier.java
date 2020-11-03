package exercice1.facade;

import exercice1.modele.Corrige;
import exercice1.modele.Panier;
import exercice1.modele.paiement.MoyenPaiement;

public class FacadePanier {

    private Panier panier;


    public FacadePanier() {
        panier = new Panier();
    }


    public void ajouterCorrigesAuPanier(Corrige... corriges) {
        for (Corrige c : corriges)
            this.panier.addItem(c);
    }


    public void payer(MoyenPaiement moyenPaiement) {
        panier.pay(moyenPaiement);
    }

    public void initialiserPanier(){
        panier = new Panier();
    }
}
