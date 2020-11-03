package exercice1.modele.paiement;

public class MoyenPaiementCB implements MoyenPaiement {
    private String nom, numeroCarte, crypto, expiration;


    public MoyenPaiementCB(String nom, String numeroCarte, String crypto, String expiration) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
        this.crypto = crypto;
        this.expiration = expiration;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paiement de " + amount + "€ par " + nom +
                " CB " + numeroCarte + "/" + crypto + " expire:" + expiration);
    }
}
