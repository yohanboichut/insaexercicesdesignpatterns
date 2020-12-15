package exercice2.modele;

public abstract class DecorateurPersonne implements Personne {

    private Personne personne;


    public DecorateurPersonne(Personne personne) {
        this.personne = personne;
    }

    public Personne getPersonne() {
        return personne;
    }

    @Override
    public String getNom() {
        return this.personne.getNom();
    }

    @Override
    public String getPrenom() {
        return this.personne.getPrenom();
    }
}
