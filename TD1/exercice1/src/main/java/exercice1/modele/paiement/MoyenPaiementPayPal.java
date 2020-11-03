package exercice1.modele.paiement;

public class MoyenPaiementPayPal implements MoyenPaiement {
    private String email, numeroAutorisation;


    public MoyenPaiementPayPal(String email, String numeroAutorisation) {
        this.email = email;
        this.numeroAutorisation = numeroAutorisation;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paiement de " + amount + "€ par PAYPAL: " +email+" / " + numeroAutorisation );
    }
}
