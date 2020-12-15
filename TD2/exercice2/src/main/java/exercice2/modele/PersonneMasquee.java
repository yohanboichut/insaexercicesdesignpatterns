package exercice2.modele;

public class PersonneMasquee extends DecorateurPersonne {
    public PersonneMasquee(Personne personne) {
        super(personne);
    }


    public void sortir(){
        System.out.println("Héhé, je suis "+this.getNom()+" "+this.getPrenom()+ " et je peux sortir !!!");
    }

}
