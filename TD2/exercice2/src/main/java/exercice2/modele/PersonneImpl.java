package exercice2.modele;

public class PersonneImpl implements Personne {

    private String nom,prenom;


    public PersonneImpl(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getPrenom() {
        return this.prenom;
    }
}
