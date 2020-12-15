package exercice4;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String email;
    private String numeroTelephone;
    private Collection<Contact> contacts;
    private Personne(){
        contacts = new ArrayList<>();

    }

    public static class BuilderPersonne {

        Personne personne;
        public BuilderPersonne(String nom, String prenom){
            this.personne = new Personne();
            this.personne.setNom(nom);
            this.personne.setPrenom(prenom);

        }


        public BuilderPersonne nom(String nom){
            this.personne.setNom(nom);
            return this;
        }


        public BuilderPersonne prenom(String nom){
            this.personne.setPrenom(nom);
            return this;
        }


        public BuilderPersonne adresse(String nom){
            this.personne.setAdresse(nom);
            return this;
        }

        public BuilderPersonne ville(String nom){
            this.personne.setVille(nom);
            return this;
        }

        public BuilderPersonne email(String nom){
            this.personne.setEmail(nom);
            return this;
        }

        public BuilderPersonne numeroTelephone(String nom){
            this.personne.setNumeroTelephone(nom);
            return this;
        }


        public BuilderPersonne contact(Contact contact) {
            this.personne.getContacts().add(contact);
            return this;
        }


        public Personne build(){
            return this.personne;
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }
}
