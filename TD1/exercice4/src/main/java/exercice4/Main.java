package exercice4;

public class Main {


    public static void main(String[] args) {
        Personne personne = new Personne.BuilderPersonne("Boichut", "Yohan").
                email("yohan.boichut@univ-orleans.fr").
                contact(new Contact(Contact.SocialNetwork.LINKED,"https://www.linkedin.com/in/yohan-boichut-b0695b24/")).build();


        System.out.println("Done: "+personne);
    }
}
